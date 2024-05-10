public class Facilitati {
    private boolean arePatRabatabil;
    private boolean areMicDejunInclus;
    private boolean arePapuciDeCamera;
    private boolean areHalatInclus;

    Facilitati(boolean arePatRabatabil, boolean areMicDejunInclus, boolean arePapuciDeCamera,
               boolean areHalatInclus) {
        super();
        this.arePatRabatabil = arePatRabatabil;
        this.areMicDejunInclus = areMicDejunInclus;
        this.arePapuciDeCamera = arePapuciDeCamera;
        this.areHalatInclus = areHalatInclus;
    }

    public boolean isArePatRabatabil() {
        return arePatRabatabil;
    }

    public boolean isAreMicDejunInclus() {
        return areMicDejunInclus;
    }

    public boolean isArePapuciDeCamera() {
        return arePapuciDeCamera;
    }

    public boolean isAreHalatInclus() {
        return areHalatInclus;
    }

    void setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
    }

    void setAreMicDejunInclus(boolean areMicDejunInclus) {
        this.areMicDejunInclus = areMicDejunInclus;
    }

    void setArePapuciDeCamera(boolean arePapuciDeCamera) {
        this.arePapuciDeCamera = arePapuciDeCamera;
    }

    void setAreHalatInclus(boolean areHalatInclus) {
        this.areHalatInclus = areHalatInclus;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Facilitati pentru pacient [Are pat rabatabil = ");
        builder.append(arePatRabatabil);
        builder.append(", are mic dejun inclus = ");
        builder.append(areMicDejunInclus);
        builder.append(", are papuci de camera = ");
        builder.append(arePapuciDeCamera);
        builder.append(", are halat inclus = ");
        builder.append(areHalatInclus);
        builder.append("]");
        return builder.toString();
    }
}
