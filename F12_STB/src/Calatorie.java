public class Calatorie {
    private String denumireStatie;
    private int nrKm;

    public Calatorie(String denumireStatie, int nrKm) {
        super();
        this.denumireStatie = denumireStatie;
        this.nrKm = nrKm;
    }

    public String getDenumireStatie() {
        return denumireStatie;
    }

    public int getNrKm() {
        return nrKm;
    }
}
