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

    //metode specifice nod structura
    @Override
    public void adaugaNod(ANod copil) {
        throw new UnsupportedOperationException("Nu se poate adauga un subprodus");
    }

    @Override
    public void stergeNod(ANod copil) {
        throw new UnsupportedOperationException("Nu se poate sterge un subprodus");
    }

    @Override
    public ANod getNod(int i) {
        throw new UnsupportedOperationException(" ");
    }
}
