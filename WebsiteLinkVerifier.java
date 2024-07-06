import java.net.InetAddress;
import java.net.UnknownHostException;

public class WebsiteLinkVerifier {
public static void main(String[] args) {
try {
InetAddress firstHost = InetAddress.getByName("www.facebook.com");
InetAddress secondHost = InetAddress.getByName("www.fb.com");

if (firstHost.equals(secondHost)) {
System.out.println("provide two host are pointing to the same machine");
System.out.println("FirstHost:" + firstHost);
System.out.println("SecondHost" + secondHost);
} 
else {
System.out.println("provide two host are not pointing to the same machine");
System.out.println("FirstHost:" + firstHost);
System.out.println("SecondHost" + secondHost);
}
       } 
catch (UnknownHostException unknownHostException) {
System.out.println("Host lookup failed.");
}
      }
}
