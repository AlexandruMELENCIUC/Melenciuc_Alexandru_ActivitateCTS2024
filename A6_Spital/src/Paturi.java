public class Paturi {
    private float nrInventar;
    private boolean disponibil;

    public Paturi(float nrInventar, boolean disponibil) {
        this.nrInventar = nrInventar;
        this.disponibil = disponibil;
    }

    public float getNrInventar() {
        return nrInventar;
    }

    public void setNrInventar(float nrInventar) {
        this.nrInventar = nrInventar;
    }

    public boolean isDisponibil() {
        return disponibil;
    }

    public void setDisponibil(boolean disponibil) {
        this.disponibil = disponibil;
    }
}
