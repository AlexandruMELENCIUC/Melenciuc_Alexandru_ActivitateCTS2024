public class Optiuni {
    private boolean areNumarPungi;
    private boolean arePlataCuCard;
    private boolean areCardFidelitate;
    private boolean areCotaTVA;

    Optiuni(boolean areNumarPungi, boolean arePlataCuCard, boolean areCardFidelitate, boolean areCotaTVA) {
        this.areNumarPungi = areNumarPungi;
        this.arePlataCuCard = arePlataCuCard;
        this.areCardFidelitate = areCardFidelitate;
        this.areCotaTVA = areCotaTVA;
    }

    public boolean isAreNumarPungi() {
        return areNumarPungi;
    }

    public boolean isArePlataCuCard() {
        return arePlataCuCard;
    }

    public boolean isAreCardFidelitate() {
        return areCardFidelitate;
    }

    public boolean isAreCotaTVA() {
        return areCotaTVA;
    }

    void setAreNumarPungi(boolean areNumarPungi) {
        this.areNumarPungi = areNumarPungi;
    }

    void setArePlataCuCard(boolean arePlataCuCard) {
        this.arePlataCuCard = arePlataCuCard;
    }

    void setAreCardFidelitate(boolean areCardFidelitate) {
        this.areCardFidelitate = areCardFidelitate;
    }

    void setAreCotaTVA(boolean areCotaTVA) {
        this.areCotaTVA = areCotaTVA;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Optiuni factura [Clientul a cerut punga=");
        builder.append(areNumarPungi);
        builder.append(", plateste cu cardul=");
        builder.append(arePlataCuCard);
        builder.append(", are card de fidelitate=");
        builder.append(areCardFidelitate);
        builder.append(", este platitor de TVA=");
        builder.append(areCotaTVA);
        builder.append("]");
        return builder.toString();
    }
}
