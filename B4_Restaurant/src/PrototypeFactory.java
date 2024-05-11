import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
    private static Map<String, AClient> prototipuriClient = new HashMap<>();

    static {
        System.out.println("Initializare clienti prin citirea din baza de date");
        Client client = new Client();
        prototipuriClient.put("nume", client);
    }

    public static AClient getPrototipClient(String nume) {
        AClient clientObisnuit = null;
        AClient prototipClient = prototipuriClient.get(nume);
        if (prototipClient != null) {
            clientObisnuit = prototipClient.clone();
        }
        return clientObisnuit;
    }
}
