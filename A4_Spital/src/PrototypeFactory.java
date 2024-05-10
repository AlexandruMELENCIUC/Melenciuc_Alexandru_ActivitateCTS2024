import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
    private static Map<String, AReteta> prototipRetete = new HashMap<>();

    static {
        System.out.println("Initializare retete prin citirea din baza de date");
        RetetaMedicament retetaMedicament = new RetetaMedicament();
        prototipRetete.put("reteta", retetaMedicament);
    }

    public static AReteta getPrototipReteta(String nume) {
        AReteta reteta = null;
        AReteta prototipReteta = prototipRetete.get(nume);
        if (prototipReteta != null) {
            reteta = prototipReteta.clone();
        }
        return reteta;
    }
}
