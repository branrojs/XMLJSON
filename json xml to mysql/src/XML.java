
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
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
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.NodeList;
import org.w3c.dom.traversal.DocumentTraversal;
import org.w3c.dom.traversal.NodeFilter;
import org.w3c.dom.traversal.NodeIterator;
import org.xml.sax.InputSource;
public class XML {
    
    //obtiene valor del nodo
    private static String obtenerNodoValor(String strtag, Element ePersona){
        Node nValor;
        nValor = (Node)ePersona.getElementsByTagName(strtag).item(0).getFirstChild();
        return nValor.getNodeValue();
        
    }
    
    //obtiene los nodos y lo manda al anterior a verificar
    public ArrayList<DatosXML> obtenerPersonas(String item){
        ArrayList<DatosXML> listaPersonas = new ArrayList<DatosXML>();
        try{
        //Validacion y lectura del disco para abrir xml
       DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
       DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
       Document doc = docBuilder.parse(new File("C:\\Users\\Andres\\Documents\\Visual Studio 2013\\Projects\\json to csharp\\json to csharp\\bin\\Debug\\xCurriculums\\"+item));
       //prepara el archivo y los datos
       doc.getDocumentElement().normalize();
       //obtiene nodos con etiquetas
       NodeList nodosPersonas = doc.getElementsByTagName("informacion");
       //por cada nodo que se obtuvo se obtendran los datos y se guardaran en un objeto tipo personas
        for (int i = 0; i< nodosPersonas.getLength(); i++) {
            Node persona = nodosPersonas.item(i);
            if (persona.getNodeType() == Node.ELEMENT_NODE) {
                Element unElemento = (Element) persona;
                //se crea un objeto personas y se le da un valor a las variables de esa clase
                //se obtiene el valor de la clase obtener NodoValor con el tag y el elemento.
                DatosXML objPersona=new DatosXML();
                objPersona.setNombre(obtenerNodoValor("nombre", unElemento));
                objPersona.setCedula(Integer.parseInt(obtenerNodoValor("cedula", unElemento)));
                objPersona.setDireccion(obtenerNodoValor("direccion", unElemento));
                objPersona.setEmail(obtenerNodoValor("correo", unElemento));
                objPersona.setTelefono(Integer.parseInt(obtenerNodoValor("telefono", unElemento)));
                objPersona.setEdu_l(obtenerNodoValor("lugar", unElemento));
                objPersona.setEdu_C(obtenerNodoValor("carrera", unElemento));
                objPersona.setEdu_A(obtenerNodoValor("años", unElemento));
                objPersona.setExp_l(obtenerNodoValor("lugar", unElemento));
                objPersona.setExp_C(obtenerNodoValor("cargo", unElemento));
                objPersona.setExp_A(obtenerNodoValor("años", unElemento));
                
                listaPersonas.add(objPersona);
            }
            
        }
       
       }catch(ParserConfigurationException parseE){
           
       }catch (SAXException saxE){
            System.out.println(saxE.getMessage());
        }catch(IOException ioE){
            System.out.println(ioE.getMessage());
        }
        return listaPersonas;
    }
    //metodo para agregar personas al XML
    
    
}
