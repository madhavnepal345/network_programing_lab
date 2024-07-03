import java.net.MalformedURLException;
import java.net.URL;

public class ConstructingURL {
    public static void main(String[] args) {
        String protocol="http";
        String host="www.google.com";
        String file="/bca_notes.pdf";
        try{
            URL simpleUrl = new URL(protocol,host,file);
            System.out.println("URL: " + simpleUrl.toString());
            System.out.println("Protocol: " + simpleUrl.getProtocol());
            System.out.println("Hostname: " + simpleUrl.getHost());
        }catch(MalformedURLException malformedURLException){
            System.err.println(malformedURLException);
        }
    }
}