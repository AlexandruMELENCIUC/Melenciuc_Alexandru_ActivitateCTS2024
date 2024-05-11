public class OptiuniBuilder implements IBuilder{
    private Optiuni optiuni;

    public OptiuniBuilder() {
        optiuni = new Optiuni(false,false,false,false);
    }

    public OptiuniBuilder setAreNumarPungi(boolean areNumarPungi){
        this.optiuni.setAreNumarPungi(areNumarPungi);
        return this;
    }

    public OptiuniBuilder setArePlataCuCard(boolean arePlataCuCard){
        this.optiuni.setArePlataCuCard(arePlataCuCard);
        return this;
    }

    public OptiuniBuilder setAreCardFidelitate(boolean areCardFidelitate){
        this.optiuni.setAreCardFidelitate(areCardFidelitate);
        return this;
    }

    public OptiuniBuilder setAreCotaTVA(boolean areCotaTVA){
        this.optiuni.setAreCotaTVA(areCotaTVA);
        return this;
    }

    @Override
    public Optiuni build() {
        return optiuni;
    }
}
