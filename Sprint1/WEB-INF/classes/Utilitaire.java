package fonction;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;
public class Utilitaire{
    public String url(String url) throws Exception{    
        String supprime_le_baseurl=url.replace("http://localhost:8082/Sprint1/" , "").split("\\?")[0];
        return supprime_le_baseurl;
    }
   
}