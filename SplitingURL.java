import java.net.URL;
import java.net.MalformedURLException;
public class SplitingURL {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.bbc.com/sport/athletics/articles/cd1j3nk2183o");
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("User Info: " + url.getUserInfo()==null? "User Not Found":url.getUserInfo());

            System.out.println("Authority: " + url.getAuthority());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort());
            System.out.println("Path: " + url.getPath());
            System.out.println("Query: " + url.getQuery());
            System.out.println("File: " + url.getFile());
            System.out.println("Ref: " + url.getRef());
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL");

}
}
}