public class Main {
    public static void main(String[] args) {
        ModVerificare modVerificareActe = new ModVerificare();

        modVerificareActe.setStrategieVerificareActe(new VerificaPF());
        modVerificareActe.verificaActe();


        modVerificareActe.setStrategieVerificareActe(new VerificaPJ());
        modVerificareActe.verificaActe();
    }
}
