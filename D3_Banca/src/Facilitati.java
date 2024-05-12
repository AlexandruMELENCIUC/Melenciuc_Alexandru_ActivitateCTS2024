public class Facilitati {
    private boolean primesteSalariu;
    private boolean areCardAtasat;
    private boolean areInternetBanking;

    Facilitati(boolean primesteSalariu, boolean areCardAtasat, boolean areInternetBanking) {
        super();
        this.primesteSalariu = primesteSalariu;
        this.areCardAtasat = areCardAtasat;
        this.areInternetBanking = areInternetBanking;
    }

    public boolean isPrimesteSalariu() {
        return primesteSalariu;
    }

    public boolean isAreCardAtasat() {
        return areCardAtasat;
    }

    public boolean isAreInternetBanking() {
        return areInternetBanking;
    }

    void setPrimesteSalariu(boolean primesteSalariu) {
        this.primesteSalariu = primesteSalariu;
    }

    void setAreCardAtasat(boolean areCardAtasat) {
        this.areCardAtasat = areCardAtasat;
    }

    void setAreInternetBanking(boolean areInternetBanking) {
        this.areInternetBanking = areInternetBanking;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Facilitati cont: primeste salariu=");
        builder.append(primesteSalariu);
        builder.append(", are card atasat=");
        builder.append(areCardAtasat);
        builder.append(", are internet banking=");
        builder.append(areInternetBanking);
        builder.append(".");
        return builder.toString();
    }
}
