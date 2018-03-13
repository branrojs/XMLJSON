using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO;
using System.Web.Script.Serialization;
using Newtonsoft.Json;

namespace json_to_csharp
{
    public partial class Convertidor : Form
    {
        string nom, dir, corr, edu_l, edu_c, exp_l, exp_c, exp_a;
        int tel, edu_a, ced;
        public class Rootobject
        {
            public Curriculum Curriculum { get; set; }
        }

        public class Curriculum
        {
            public InformaciónGeneral InformaciónGeneral { get; set; }
            public Educación Educación { get; set; }
            public Experiencia Experiencia { get; set; }
        }

        public class InformaciónGeneral
        {
            public int Cedula { get; set; }
            public string Nombre { get; set; }
            public string Dirección { get; set; }
            public string CorreoELectrónico { get; set; }
            public int Teléfono { get; set; }
        }

        public class Educación
        {
            public string Lugar { get; set; }
            public string Carrera { get; set; }
            public int AñodeGraduación { get; set; }
        }

        public class Experiencia
        {
            public string Lugar { get; set; }
            public string Cargo { get; set; }
            public string TiempodeServicio { get; set; }
        }


        public Convertidor()
        {
            InitializeComponent();
            DirectoryInfo di = new DirectoryInfo(@"C:\Users\Andres\Documents\Visual Studio 2013\Projects\json to csharp\json to csharp\bin\Debug\Docentes\");
            Console.WriteLine("No search pattern returns:");
            foreach (var fi in di.GetFiles())
            {
                string arc = fi.ToString();
                string[] aux = arc.Split('.');
                cb_txt.Items.Add(aux[0]);
            }

        }

        private void btn_cargar_Click(object sender, EventArgs e)
        {
            try
            {
                string archivotxt = cb_txt.SelectedItem.ToString();
                archivotxt = archivotxt + ".txt";
                string[] lines = System.IO.File.ReadAllLines(@"C:\Users\Andres\Documents\Visual Studio 2013\Projects\json to csharp\json to csharp\bin\Debug\Docentes\" + archivotxt);
                foreach (string line in lines)
                {
                    lb_txt.Items.Add(line);
                }
            }
            catch
            {
                MessageBox.Show("Curriculum no encontrado","Curriculum",MessageBoxButtons.OK, MessageBoxIcon.Error);
            } 
        }

        private void Convertidor_Load(object sender, EventArgs e)
        {

        }

        private void btn_convertir_Click(object sender, EventArgs e)
        {

            try
            {
                string archivotxt = cb_txt.SelectedItem.ToString();
                archivotxt = archivotxt + ".txt";
                string text = System.IO.File.ReadAllText(@"C:\Users\Andres\Documents\Visual Studio 2013\Projects\json to csharp\json to csharp\bin\Debug\Docentes\" + archivotxt);
                string[] sep = text.Split(':','\n');
                for (int i=3;i<sep.Length;i++)
                {
                    if (i==13 || i==21)
                    {
                        i += 2;
                    }
                    if (i == 3)
                    {
                        ced = Int32.Parse(sep[i]);
                    }
                    if (i == 5)
                    {
                        nom = sep[i];
                    }
                    if (i == 7)
                    {
                        dir = sep[i];
                    }
                    if (i == 9)
                    {
                        corr = sep[i];
                    }
                    if (i == 11)
                    {
                        tel = Int32.Parse(sep[i]);
                    }
                    if (i == 15)
                    {
                        edu_l = sep[i];
                    }
                    if (i == 17)
                    {
                        edu_c = sep[i];
                    }
                    if (i == 19)
                    {
                        edu_a = Int32.Parse(sep[i]);
                    }
                    if (i == 23)
                    {
                        exp_l = sep[i];
                    }
                    if (i == 25)
                    {
                        exp_c = sep[i];
                    }
                    if (i == 27)
                    {
                        exp_a = sep[i];
                    }

                    i += 1;
                }

                Curriculum Cur = new Curriculum()
                {
                    InformaciónGeneral = new InformaciónGeneral
                    {
                        Cedula = ced,
                        Nombre = nom,
                        Dirección = dir,
                        Teléfono = tel
                    },
                    Educación = new Educación
                    {
                        Lugar = edu_l,
                        Carrera = edu_c,
                        AñodeGraduación = edu_a
                    },
                    Experiencia = new Experiencia
                    {
                        Lugar = exp_l,
                        Cargo = exp_c,
                        TiempodeServicio = exp_a
                    }
                };
                string output = JsonConvert.SerializeObject(Cur, Formatting.Indented);
                System.IO.File.WriteAllText(@"C:\Users\Andres\Documents\Visual Studio 2013\Projects\json to csharp\json to csharp\bin\Debug\jCurriculums\"+ced+".json",output);
                MessageBox.Show("Convertido a Json Correctamente", "Curriculum", MessageBoxButtons.OK, MessageBoxIcon.Information);
            }
            catch
            {
                MessageBox.Show("Convirtiendo el txt a json ", "Curriculum", MessageBoxButtons.OK, MessageBoxIcon.Error);
            } 
        }

        private void btn_actualizar_Click(object sender, EventArgs e)
        {
            DirectoryInfo di = new DirectoryInfo(@"C:\Users\Andres\Documents\Visual Studio 2013\Projects\json to csharp\json to csharp\bin\Debug\Docentes\");
            Console.WriteLine("No search pattern returns:");
            int cant = cb_txt.Items.Count;
            for (int i = 0; i < cant;i++)
            {
                cb_txt.Items.RemoveAt(i);
            }
                foreach (var fi in di.GetFiles())
                {
                    string arc = fi.ToString();
                    string[] aux = arc.Split('.');
                    cb_txt.Items.Add(aux[0]);
                }
        }

    }
}
