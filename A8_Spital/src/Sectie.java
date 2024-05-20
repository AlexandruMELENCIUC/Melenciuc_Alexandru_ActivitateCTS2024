public class Sectie extends ANod {
    private String denumire;
    private int nrDoctori;

    @Override
    public String getDenumire() {
        return this.denumire;
    }

    @Override
    public int getNrDoctori() {
        return this.nrDoctori;
    }

    public Sectie(String denumire, int nrDoctori) {
        super();
        this.denumire = denumire;
        this.nrDoctori=nrDoctori;
    }

    @Override
    public void adauga(ANod copil) {
        throw new UnsupportedOperationException("Nu se poate adauga o subsectie!");

    }

    @Override
    public void sterge(ANod copil) {
        throw new UnsupportedOperationException("Nu se poate sterge o subsectie!");

    }

    @Override
    public ANod getCopil(int index) {
        throw new UnsupportedOperationException("Nu se poate obtine o subsectie!");
    }
}
