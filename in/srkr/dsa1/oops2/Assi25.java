package in.srkr.dsa1.oops2;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
public class Assi25 {

    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.example.com");
            URLConnection connection = url.openConnection();
            System.out.println("Network operation completed successfully!");
        } catch (Exception e) {
            System.err.println("An error occurred during the network operation:");
            e.printStackTrace();
        }
    }
}