public class FacilitatiBuilder implements IBuilder{
    private Facilitati facilitati;

    public FacilitatiBuilder() {
        facilitati = new Facilitati(false, false, false, false);
    }

    public FacilitatiBuilder setArePatRabatabil(boolean arePatRabatabil) {
        this.facilitati.setArePatRabatabil(arePatRabatabil);
        return this;
    }

    public FacilitatiBuilder setAreMicDejunInclus(boolean areMicDejunInclus) {
        this.facilitati.setAreMicDejunInclus(areMicDejunInclus);
        return this;
    }

    public FacilitatiBuilder setArePapuciDeCamera(boolean arePapuciDeCamera) {
        this.facilitati.setArePapuciDeCamera(arePapuciDeCamera);
        return this;
    }

    public FacilitatiBuilder setAreHalatInclus(boolean areHalatInclus) {
        this.facilitati.setAreHalatInclus(areHalatInclus);
        return this;
    }

    @Override
    public Facilitati build() {
        return facilitati;
    }
}
