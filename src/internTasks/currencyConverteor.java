package internTasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;

public class currencyConverteor {
    private static final String API_URL = "https://www.floatrates.com/daily/usd.xml";

    public static void main(String[] args) {
        String baseCurrency = "USD";
        String targetCurrency = "INR";

        double exchangeRate = getExchangeRate(baseCurrency, targetCurrency);
        if (exchangeRate != -1) {
            double amount = 100;
            double convertedAmount = amount * exchangeRate;
            System.out.println("Converted Amount: " + convertedAmount + " " + targetCurrency);
        } else {
            System.out.println("Error fetching exchange rate!");
        }
    }

    public static double getExchangeRate(String baseCurrency, String targetCurrency) {
        try {
            URL url = new URL("https://www.floatrates.com/daily/" + baseCurrency.toLowerCase() + ".xml");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document doc = builder.parse(conn.getInputStream());
            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("item");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    String currencyCode = element.getElementsByTagName("targetCurrency").item(0).getTextContent();

                    if (currencyCode.equalsIgnoreCase(targetCurrency)) {
                        return Double.parseDouble(element.getElementsByTagName("exchangeRate").item(0).getTextContent());
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return -1;
    }
}
