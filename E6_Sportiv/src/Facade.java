import java.util.ArrayList;
import java.util.List;

public class Facade {
    private List<Object> verificari;

    public Facade() {
        this.verificari = new ArrayList<>();
    }

    public void adaugaVerificare(Object verificare) {
        this.verificari.add(verificare);
    }

    public boolean verificaPersoana(Persoana persoana) {
        VerificaBilet verificaBilet = new VerificaBilet();
        VerificaPolitie verificaPolitie = new VerificaPolitie();
        VerificaAntecedente verificaAntecedente = new VerificaAntecedente();

        boolean rezultatBilet = verificaBilet.verificaBilet(persoana.getCNP(), persoana.getSerieBilet());
        boolean rezultatPolitie = verificaPolitie.verificaPolitie(persoana.getCNP(), persoana.getSerieBilet());
        boolean rezultatAntecedente = verificaAntecedente.verificaAplicatie(persoana.getCNP(), persoana.getSerieBilet());

        if (!rezultatBilet) {
            System.out.println("Biletul nu este pe numele persoanei.");
            return false;
        }

        if (rezultatPolitie) {
            System.out.println("Persoana este cautata de politie.");
            return false;
        }

        if (rezultatAntecedente) {
            System.out.println("Persoana are antecedente pe alte stadioane.");
            return false;
        }

        System.out.println("Persoana poate intra pe stadion.");
        return true;
    }
}
