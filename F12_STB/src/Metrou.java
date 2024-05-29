public class Metrou extends AHandler {
    @Override
    void procesareCalatorie(Calatorie calatorie) {
        System.out.println(
                "Calatoria pana in statia " + calatorie.getDenumireStatie() + " poate fi parcursa cu metroul.");
    }
}
