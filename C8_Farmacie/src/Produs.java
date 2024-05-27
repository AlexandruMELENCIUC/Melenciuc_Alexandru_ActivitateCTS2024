public class Produs extends ANod {
    String denumire;
    int pret;

    public Produs(String denumire, int pret) {
        super();
        this.denumire = denumire;
        this.pret = pret;
    }

    @Override
    public String getDenumire() {
        return this.denumire;
    }

    @Override
    public int getPret() {
        return this.pret;
    }

    @Override
    public void adaugaNod(ANod copil) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeNod(ANod copil) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ANod getNod(int i) {
        throw new UnsupportedOperationException();
    }
}
