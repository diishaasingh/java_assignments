package assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class CaizinAddress {
    public static void main(String[] args) {
        try {
            URL caizinURL = new URL("https://caizin.com/contact-us/");
            BufferedReader reader = new BufferedReader(new InputStreamReader(caizinURL.openStream()));

            StringBuilder htmlContent = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                htmlContent.append(line);
            }

            // Find the start and end index of the address content
            int startIndex = htmlContent.indexOf("Caizin (India)");
            int endIndex = htmlContent.indexOf("</div>", startIndex);

            if (startIndex != -1 && endIndex != -1) {
                String addressLine = htmlContent.substring(startIndex, endIndex);
                String address = stripHtmlTags(addressLine);
                System.out.println("Address:");
                System.out.println(address);
            } else {
                System.out.println("Address not found.");
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String stripHtmlTags(String html) {  // to remove html tags
        return html.replaceAll("\\<.*?\\>", "").trim();
    }
}