namespace json_to_csharp
{
    partial class Convertidor
    {
        /// <summary>
        /// Variable del diseñador requerida.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpiar los recursos que se estén utilizando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben desechar; false en caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de Windows Forms

        /// <summary>
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido del método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.lb_txt = new System.Windows.Forms.ListBox();
            this.btn_cargar = new System.Windows.Forms.Button();
            this.btn_convertir = new System.Windows.Forms.Button();
            this.cb_txt = new System.Windows.Forms.ComboBox();
            this.btn_actualizar = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // lb_txt
            // 
            this.lb_txt.FormattingEnabled = true;
            this.lb_txt.Location = new System.Drawing.Point(25, 55);
            this.lb_txt.Name = "lb_txt";
            this.lb_txt.Size = new System.Drawing.Size(489, 238);
            this.lb_txt.TabIndex = 0;
            // 
            // btn_cargar
            // 
            this.btn_cargar.Location = new System.Drawing.Point(409, 26);
            this.btn_cargar.Name = "btn_cargar";
            this.btn_cargar.Size = new System.Drawing.Size(105, 23);
            this.btn_cargar.TabIndex = 2;
            this.btn_cargar.Text = "Cargar txt";
            this.btn_cargar.UseVisualStyleBackColor = true;
            this.btn_cargar.Click += new System.EventHandler(this.btn_cargar_Click);
            // 
            // btn_convertir
            // 
            this.btn_convertir.Location = new System.Drawing.Point(401, 299);
            this.btn_convertir.Name = "btn_convertir";
            this.btn_convertir.Size = new System.Drawing.Size(110, 28);
            this.btn_convertir.TabIndex = 3;
            this.btn_convertir.Text = "Convertir";
            this.btn_convertir.UseVisualStyleBackColor = true;
            this.btn_convertir.Click += new System.EventHandler(this.btn_convertir_Click);
            // 
            // cb_txt
            // 
            this.cb_txt.FormattingEnabled = true;
            this.cb_txt.Location = new System.Drawing.Point(25, 26);
            this.cb_txt.Name = "cb_txt";
            this.cb_txt.Size = new System.Drawing.Size(267, 21);
            this.cb_txt.TabIndex = 4;
            // 
            // btn_actualizar
            // 
            this.btn_actualizar.BackgroundImageLayout = System.Windows.Forms.ImageLayout.None;
            this.btn_actualizar.Location = new System.Drawing.Point(298, 26);
            this.btn_actualizar.Name = "btn_actualizar";
            this.btn_actualizar.Size = new System.Drawing.Size(105, 21);
            this.btn_actualizar.TabIndex = 5;
            this.btn_actualizar.Text = "Actualizar";
            this.btn_actualizar.UseVisualStyleBackColor = true;
            this.btn_actualizar.Click += new System.EventHandler(this.btn_actualizar_Click);
            // 
            // Convertidor
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.ActiveCaption;
            this.ClientSize = new System.Drawing.Size(537, 338);
            this.Controls.Add(this.btn_actualizar);
            this.Controls.Add(this.cb_txt);
            this.Controls.Add(this.btn_convertir);
            this.Controls.Add(this.btn_cargar);
            this.Controls.Add(this.lb_txt);
            this.Name = "Convertidor";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Convertidor";
            this.Load += new System.EventHandler(this.Convertidor_Load);
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.ListBox lb_txt;
        private System.Windows.Forms.Button btn_cargar;
        private System.Windows.Forms.Button btn_convertir;
        private System.Windows.Forms.ComboBox cb_txt;
        private System.Windows.Forms.Button btn_actualizar;


    }
}

