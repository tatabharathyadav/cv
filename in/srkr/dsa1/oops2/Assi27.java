package in.srkr.dsa1.oops2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Assi27 {

    public static void main(String[] args) {
        try {
            URL url = new URL("https://api.example.com/data");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();
            if (responseCode >= 200 && responseCode < 300) {
                
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                StringBuilder response = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();
                System.out.println("API response: " + response.toString());
            } else {
                System.err.println("API request failed with response code: " + responseCode);
            }
            connection.disconnect();
        } catch (IOException e) {
            System.err.println("An error occurred during the API request:");
            e.printStackTrace();
        }
    }
}