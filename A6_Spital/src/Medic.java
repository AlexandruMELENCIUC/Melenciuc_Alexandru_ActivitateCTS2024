public class Medic {
    private String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public boolean confirmareInternare(Pacient pacient) {
        return true;
    }
}
