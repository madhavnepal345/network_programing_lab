import java.net.MalformedURLException;
import java.net.URL;

public class ConstructingURL {
    public static void main(String[] args) {
        String protocol="http";
        String host="www.google.com";
        String file="/bca_notes.pdf";
        int port=1045;
        try{
            URL simpleUrl = new URL(protocol,host,file);
            System.out.println("URL: " + simpleUrl.toString());
            System.out.println("Protocol: " + simpleUrl.getProtocol());
            System.out.println("Hostname: " + simpleUrl.getHost());
            System.out.println("Port: " + simpleUrl.getPort());

        }catch(MalformedURLException malformedURLException){
            System.err.println(malformedURLException);
        }
    }
}