public class FacilitatiBuilder implements IBuilder {
    private Facilitati facilitati;


    public FacilitatiBuilder() {
        facilitati = new Facilitati(false, false, false);
    }

    public FacilitatiBuilder setPrimesteSalariu(boolean primesteSalariu) {
        this.facilitati.setPrimesteSalariu(primesteSalariu);
        return this;
    }

    public FacilitatiBuilder setAreCardAtasat(boolean areCardAtasat) {
        this.facilitati.setAreCardAtasat(areCardAtasat);
        return this;
    }

    public FacilitatiBuilder setAreInternetBanking(boolean areInternetBanking) {
        this.facilitati.setAreInternetBanking(areInternetBanking);
        return this;
    }

    @Override
    public Facilitati build() {
        return facilitati;
    }
}
