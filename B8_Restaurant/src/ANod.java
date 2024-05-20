public abstract class ANod {
    //pentru noduri frunza
    public abstract String getDenumire();
    public abstract int getPret();

    //pentru toate nodurile
    public String getInfo() {
        return " " + this.getDenumire() + " " + this.getPret();
    }

    //metode specifice pentru noduri structura
    public abstract void adaugaNod(ANod copil);
    public abstract void stergeNod(ANod copil);
    public abstract ANod getNod(int i);
}
