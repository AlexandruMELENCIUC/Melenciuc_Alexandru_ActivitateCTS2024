public class ModVerificare {
    private IVerifica strategieVerificareActe;

    public void setStrategieVerificareActe(IVerifica strategieVerificareActe) {
        this.strategieVerificareActe = strategieVerificareActe;
    }

    public void verificaActe() {
        strategieVerificareActe.verificaActe();
    }
}
