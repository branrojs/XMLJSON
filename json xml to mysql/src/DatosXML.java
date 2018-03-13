
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.NodeList;
public class DatosXML {
    private String titulo,nombre,direccion,correo,edu_l,edu_c,edu_a,exp_l,exp_c,exp_a;
    private int cedula,telefono;
    
    public int getCedula() {
        return cedula;
    }
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getEmail() {
        return correo;
    }
    public void setEmail(String email) {
        this.correo = email;
    }
    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public String getEdu_l() {
        return edu_l;
    }
    public void setEdu_l(String edu_l) {
        this.edu_l = edu_l;
    }
    public String getEdu_C() {
        return edu_c;
    }
    public void setEdu_C(String edu_c) {
        this.edu_c = edu_c;
    }
        public String getEdu_A() {
        return edu_a;
    }
    public void setEdu_A(String edu_a) {
        this.edu_a = edu_a;
    }
    public String getExp_l() {
        return exp_l;
    }
    public void setExp_l(String exp_l) {
        this.exp_l = exp_l;
    }
        public String getExp_C() {
        return exp_c;
    }
    public void setExp_C(String exp_c) {
        this.exp_c = exp_c;
    }
    public String getExp_A() {
        return exp_a;
    }
    public void setExp_A(String exp_a) {
        this.exp_a = exp_a;
    }
}
