public class Optiuni {
    private boolean areAsezareLaGeam;
    private boolean areScaunErgonomic;
    private boolean areMasaDecorata;
    private boolean areMuzicaPersonalizata;
    private boolean areGenMuzica;

    Optiuni(boolean areAsezareLaGeam, boolean areScaunErgonomic, boolean areMasaDecorata,
            boolean areMuzicaPersonalizata, boolean areGenMuzica) {
        super();
        this.areAsezareLaGeam = areAsezareLaGeam;
        this.areScaunErgonomic = areScaunErgonomic;
        this.areMasaDecorata = areMasaDecorata;
        this.areMuzicaPersonalizata = areMuzicaPersonalizata;
        this.areGenMuzica = areGenMuzica;
    }

    public boolean isAreAsezareLaGeam() {
        return areAsezareLaGeam;
    }

    public boolean isAreScaunErgonomic() {
        return areScaunErgonomic;
    }

    public boolean isAreMasaDecorata() {
        return areMasaDecorata;
    }

    public boolean isAreMuzicaPersonalizata() {
        return areMuzicaPersonalizata;
    }

    public boolean isAreGenMuzica() {
        return areGenMuzica;
    }

    void setAreAsezareLaGeam(boolean areAsezareLaGeam) {
        this.areAsezareLaGeam = areAsezareLaGeam;
    }

    void setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
    }

    void setAreMasaDecorata(boolean areMasaDecorata) {
        this.areMasaDecorata = areMasaDecorata;
    }

    void setAreMuzicaPersonalizata(boolean areMuzicaPersonalizata) {
        this.areMuzicaPersonalizata = areMuzicaPersonalizata;
    }

    void setAreGenMuzica(boolean areGenMuzica) {
        this.areGenMuzica = areGenMuzica;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Optiuni rezervare: Are asezare la geam=");
        builder.append(areAsezareLaGeam);
        builder.append(", are scaun ergonomic=");
        builder.append(areScaunErgonomic);
        builder.append(", are masa decorata=");
        builder.append(areMasaDecorata);
        builder.append(", are muzica personalizata=");
        builder.append(areMuzicaPersonalizata);
        builder.append(", are gen de muzica=");
        builder.append(areGenMuzica);
        builder.append(".");
        return builder.toString();
    }
}
