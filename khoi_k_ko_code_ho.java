import java.net.URL;
import java.net.MalformedURLException;

public class khoi_k_ko_code_ho {
    public static void main(String[] args) {
        try{
            String relative1 = "javascript.js";
            String relative2 = "javacourse.java";
            URL baseUrl = new URL("https://www.Fontawosome.com/path/course/");
            URL fullUrl = new URL(baseUrl, relative1);
            URL fullUrl2 = new URL(baseUrl, relative2);
            System.out.println(fullUrl);
            System.out.println(fullUrl2);
            
        }catch(MalformedURLException e){
            System.out.println("Invalid Url");
        }
    }
}