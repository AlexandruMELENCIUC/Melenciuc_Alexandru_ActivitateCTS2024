public class Optiuni {
    private boolean areMancareInclusa;
    private boolean areScaunErgonomic;
    private boolean areBauturaInclusa;
    private boolean areMuzicaPersonalizata;
    private boolean areGenMuzica;

    Optiuni(boolean areMancareInclusa, boolean areScaunErgonomic, boolean areBauturaInclusa,
            boolean areMuzicaPersonalizata, boolean areGenMuzica) {
        super();
        this.areMancareInclusa = areMancareInclusa;
        this.areScaunErgonomic = areScaunErgonomic;
        this.areBauturaInclusa = areBauturaInclusa;
        this.areMuzicaPersonalizata = areMuzicaPersonalizata;
        this.areGenMuzica = areGenMuzica;
    }

    public boolean isAreMancareInclusa() {
        return areMancareInclusa;
    }

    public boolean isAreScaunErgonomic() {
        return areScaunErgonomic;
    }

    public boolean isAreBauturaInclusa() {
        return areBauturaInclusa;
    }

    public boolean isAreMuzicaPersonalizata() {
        return areMuzicaPersonalizata;
    }

    public boolean isAreGenMuzica() {
        return areGenMuzica;
    }

    void setAreMancareInclusa(boolean areMancareInclusa) {
        this.areMancareInclusa = areMancareInclusa;
    }

    void setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
    }

    void setAreBauturaInclusa(boolean areBauturaInclusa) {
        this.areBauturaInclusa = areBauturaInclusa;
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
        builder.append("Optiuni rezervare: are mancare inclusa=");
        builder.append(areMancareInclusa);
        builder.append(", are scaun ergonomic=");
        builder.append(areScaunErgonomic);
        builder.append(", are bautura inclusa=");
        builder.append(areBauturaInclusa);
        builder.append(", are muzica personalizata=");
        builder.append(areMuzicaPersonalizata);
        builder.append(", are gen muzica=");
        builder.append(areGenMuzica);
        builder.append(".");
        return builder.toString();
    }
}
