import java.util.*;
import java.io.*;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import org.json.simple.JSONObject;

public class conexion {
    private String db = "empleados";
    private String user = "admin";
    private String pw= "12345";
    public Connection conn = null;
    
    public void con_on()
    {
        conectar();
    }
    public void insert_json(int cedula,JSONObject json)
    {
        try
        {
            String query = "insert into docentes (cedula,informacion) values (cedula="+cedula+",informacion="+json+")";

      // create the java statement
            Statement st = conn.createStatement();
      
      // execute the query, and get a java resultset
            ResultSet rs = st.executeQuery(query);
      
      // iterate through the java resultset
            while (rs.next())
            {
                JOptionPane.showMessageDialog(null,"JSON ingresado correctamente");
            }
            st.close();
        }catch (Exception e) { JOptionPane.showMessageDialog(null,e);  }
    }
    
    public void conectar()
    {
       String url = "jdbc:mysql://localhost/"+this.db;
       try{
         //obtenemos el driver de para mysql
         Class.forName("com.mysql.jdbc.Driver");
         //obtenemos la conexión
         conn = DriverManager.getConnection(url, this.user , this.pw);
         if (conn!=null){
            System.out.println("Conexion Realizada Correctamente");
         }
      }catch(SQLException e){
         System.out.println(e);
      }catch(ClassNotFoundException e){
         System.out.println(e);
      }
   }
    
}
