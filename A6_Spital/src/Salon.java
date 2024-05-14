public class Salon {
    private String denumire;
    private int nrMinPacienti;
    private int nrMaxPacienti;

    public Salon(String denumire, int nrMinPacienti, int nrMaxPacienti) {
        super();
        this.denumire = denumire;
        this.nrMinPacienti = nrMinPacienti;
        this.nrMaxPacienti = nrMaxPacienti;
    }

    public String getDenumire() {
        return denumire;
    }

    public int getNrMinPacienti() {
        return nrMinPacienti;
    }

    public int getNrMaxPacienti() {
        return nrMaxPacienti;
    }
}
