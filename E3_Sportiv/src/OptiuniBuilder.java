public class OptiuniBuilder implements IBuilder {
    private Optiuni optiuni;

    public OptiuniBuilder() {
        optiuni = new Optiuni(false, false, false, false, false);
    }

    public OptiuniBuilder setAreMancareInclusa(boolean areMancareInclusa) {
        this.optiuni.setAreMancareInclusa(areMancareInclusa);
        return this;
    }

    public OptiuniBuilder setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.optiuni.setAreScaunErgonomic(areScaunErgonomic);
        return this;
    }

    public OptiuniBuilder setAreBauturaInclusa(boolean areBauturaInclusa) {
        this.optiuni.setAreBauturaInclusa(areBauturaInclusa);
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
    public Optiuni builder() {
        return optiuni;
    }
}
