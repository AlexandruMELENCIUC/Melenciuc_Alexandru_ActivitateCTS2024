public class OptiuniBuilder implements IBuilder {
    private Optiuni optiuni;

    public OptiuniBuilder() {
        optiuni = new Optiuni(false, false, false, false, false);
    }

    public OptiuniBuilder setAreAsezareLaGeam(boolean areAsezareLaGeam) {
        this.optiuni.setAreAsezareLaGeam(areAsezareLaGeam);
        return this;
    }

    public OptiuniBuilder setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.optiuni.setAreScaunErgonomic(areScaunErgonomic);
        return this;
    }

    public OptiuniBuilder setAreMasaDecorata(boolean areMasaDecorata) {
        this.optiuni.setAreMasaDecorata(areMasaDecorata);
        return this;
    }

    public OptiuniBuilder setAreMuzicaPersonalizata(boolean areMuzicaPersonalizata) {
        this.optiuni.setAreMuzicaPersonalizata(areMuzicaPersonalizata);
        return this;
    }

    public OptiuniBuilder setAreGenMuzica(boolean areGenMuzica) {
        this.optiuni.setAreGenMuzica(areGenMuzica);
        return this;
    }

    @Override
    public Optiuni build() {
        return optiuni;
    }
}
