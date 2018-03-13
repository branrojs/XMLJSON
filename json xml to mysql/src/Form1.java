import java.awt.Desktop;
import java.util.*;
import java.io.*;
import java.sql.*;
import javax.xml.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONArray;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.NodeList;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;

public class Form1 extends javax.swing.JFrame {
    conexion con = new conexion();
    JSONParser parser = new JSONParser();
    public Form1() {
        initComponents();
        con.con_on();
        this.setLocationRelativeTo(null);
        String sDirectorio = "C:\\Users\\admin\\Dropbox\\Banco del comercio\\Version 2\\json to csharp\\json to csharp\\bin\\Debug\\jCurriculums";
        File f = new File(sDirectorio);
        File[] ficheros = f.listFiles();
        
        for (int x=0;x<ficheros.length;x++){
            jComboBox1.addItem(ficheros[x].getName());
        }
        String sDirectorio2 = "C:\\Users\\admin\\Dropbox\\Banco del comercio\\Version 2\\json to csharp\\json to csharp\\bin\\Debug\\xCurriculums";
        File f2 = new File(sDirectorio2);
        File[] ficheros2 = f2.listFiles();
        
        for (int x=0;x<ficheros2.length;x++){
            jComboBox2.addItem(ficheros2[x].getName());
        }
    }
        public static void mostrarxml(String item){
        System.out.println("Mostrando toda la informacion en el XML");
        XML pdl=new XML();
        ArrayList<DatosXML> listaPersonas=pdl.obtenerPersonas("C:\\Users\\admin\\Dropbox\\Banco del comercio\\Version 2\\json to csharp\\json to csharp\\bin\\Debug\\xCurriculums\\"+item);
        
        for (int i = 0; i <listaPersonas.size(); i++) {
            System.out.println("Nombre: "+listaPersonas.get(i).getNombre());
            System.out.println("Cedula: "+listaPersonas.get(i).getCedula());
            System.out.println("Email: "+listaPersonas.get(i).getEmail());
            System.out.println("Direccion: "+listaPersonas.get(i).getDireccion());
            System.out.println("Telefono: "+listaPersonas.get(i).getTelefono());
            System.out.println("Lugar: "+listaPersonas.get(i).getDireccion());
            System.out.println("Carrera: "+listaPersonas.get(i).getDireccion());
            System.out.println("Years: "+listaPersonas.get(i).getDireccion());
            System.out.println("Lugar: "+listaPersonas.get(i).getDireccion());
            System.out.println("Cargo: "+listaPersonas.get(i).getDireccion());
            System.out.println("Years: "+listaPersonas.get(i).getDireccion());
            System.out.println("\n");
        }
    
    }

    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jButton4.setText("Cargar ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Cargar ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cargar ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Ingresar XML");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("Ingresar JSON");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         
        try{
            String cadena;
            Object obj = jComboBox1.getSelectedItem();
            String arc = String.valueOf(obj);
            File f = new File ("C:\\Users\\admin\\Dropbox\\Banco del comercio\\Version 2\\json to csharp\\json to csharp\\bin\\Debug\\jCurriculums\\"+arc);
            Desktop.getDesktop().open(f);
            
        }
        catch (Exception e) { JOptionPane.showMessageDialog(null,"Curriculum JSON no encontrado");  }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try{
            String cadena;
            Object obj = jComboBox2.getSelectedItem();
            String arc = String.valueOf(obj);
            try {
                File path = new File ("C:\\Users\\admin\\Dropbox\\Banco del comercio\\Version 2\\json to csharp\\json to csharp\\bin\\Debug\\xCurriculums\\"+arc);
                Desktop.getDesktop().open(path);
                }catch (IOException ex) {
                    ex.printStackTrace();
                }
            
        }
        catch (Exception e) { JOptionPane.showMessageDialog(null,"Curriculum XML no encontrado");  }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        try{
            Object obj = jComboBox1.getSelectedItem();
            String arc = String.valueOf(obj);
            Object json = parser.parse(new FileReader("C:\\Users\\admin\\Dropbox\\Banco del comercio\\json to csharp\\json to csharp\\bin\\Debug\\jCurriculums\\"+arc));
            JSONObject jObject = (JSONObject) json;
            
            
            int ced = (int) jObject.get("Cedula");
            String nom = (String) jObject.get("Nombre");
            String dir = (String) jObject.get("Dirección");
            String corr = (String) jObject.get("CorreoElectrónico");
            int tel = (int) jObject.get("Teléfono");
            JSONArray info = (JSONArray) jObject.get("Información");
            
            String edu_l = (String) jObject.get("Lugar");
            String edu_c = (String) jObject.get("Carrera");
            int edu_a = (int) jObject.get("AñodeGraduación");
            JSONArray edu = (JSONArray) jObject.get("Educación");
            
            String exp_l = (String) jObject.get("Lugar");
            String exp_c = (String) jObject.get("Cargo");
            String exp_a = (String) jObject.get("TiempodeServicio");
            JSONArray exp = (JSONArray) jObject.get("Experienca");
            
        }
        catch (Exception e) { JOptionPane.showMessageDialog(null,e);  }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    // End of variables declaration//GEN-END:variables
}
