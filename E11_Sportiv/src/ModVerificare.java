public class ModVerificare {
    private IVerifica strategieVerificare;

    public void setStrategieVerificare(IVerifica strategieVerificare) {
        this.strategieVerificare = strategieVerificare;
    }

    public void verificare() {
        strategieVerificare.verificare();
    }
}
