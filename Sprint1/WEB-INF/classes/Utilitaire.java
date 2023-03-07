package fonction;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;
public class Utilitaire{
    public String base_url() throws Exception{
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse("..\\webapps\\Test\\WEB-INF\\web.xml");
        NodeList contextParams= document.getElementsByTagName("domaine");
        Element contextParam= (Element) contextParams.item(0);
        String nom_de_domaine= contextParam.getElementsByTagName("nom").item(0).getTextContent();   
        return nom_de_domaine;
    }
    public String url(String url) throws Exception{
        String domaine= base_url();
        String supprime_le_baseurl=url.replace(domaine , "").split("\\?")[0];
        return supprime_le_baseurl;
        // return url;
    }
    public static void main(String[] args) throws Exception{
        Utilitaire Utilitaire = new Utilitaire();
        System.out.println(Utilitaire.url("http://localhost:8080/Test/"));
    }
  
}