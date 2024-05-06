public class Client {
    private String nume;
    private int varsta;
    private boolean areReteta;

    public Client(String nume, int varsta, boolean areReteta) {
        this.nume = nume;
        this.varsta = varsta;
        this.areReteta = areReteta;
    }
    public String getNume() {
        return nume;
    }
    public int getVarsta() {
        return varsta;
    }
    public boolean areReteta() {
        return areReteta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", areReteta=").append(areReteta);
        sb.append('}');
        return sb.toString();
    }
}
