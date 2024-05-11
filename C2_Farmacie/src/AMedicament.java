public abstract class AMedicament {
    private float pret;
    private String denumire;

    public AMedicament(float pret, String denumire) {
        super();
        this.pret = pret;
        this.denumire = denumire;
    }

    public abstract void fabrica();

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("este ");
        builder.append(denumire);
        builder.append(", si costa ");
        builder.append(pret);
        builder.append(" lei.");
        return builder.toString();
    }
}
