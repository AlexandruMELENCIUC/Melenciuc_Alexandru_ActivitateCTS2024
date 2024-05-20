public abstract class ANod {
    //noduri frunza
    public abstract String getDenumire();
    public abstract int getNrDoctori();

    //pentru toate nodurile
    public String getInfo() {
        return " " + this.getDenumire() + " " + this.getNrDoctori();
    }

    //specifice nodurilor structura
    public abstract void adauga(ANod copil);
    public abstract void sterge(ANod copil);
    public abstract ANod getCopil(int index);
}
