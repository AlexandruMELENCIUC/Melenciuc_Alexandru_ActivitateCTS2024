public abstract class ANod {
    public abstract String getDenumire();
    public abstract int getPret();

    public String getInfo() {
        return " " + this.getDenumire() + " " + this.getPret();
    }

    public abstract void adaugaNod(ANod copil);
    public abstract void stergeNod(ANod copil);
    public abstract ANod getNod(int i);
}
