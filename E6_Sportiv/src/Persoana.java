public class Persoana {
    private String nume;
    private String CNP;
    private String serieBilet;

    public Persoana(String nume, String CNP, String serieBilet) {
        this.nume = nume;
        this.CNP = CNP;
        this.serieBilet = serieBilet;
    }

    public String getNume() {
        return nume;
    }

    public String getCNP() {
        return CNP;
    }

    public String getSerieBilet() {
        return serieBilet;
    }
}
