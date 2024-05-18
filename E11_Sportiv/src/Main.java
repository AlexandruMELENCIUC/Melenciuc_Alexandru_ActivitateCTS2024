public class Main {

    public static void main(String[] args) {
        ModVerificare modVerificare = new ModVerificare();

        modVerificare.setStrategieVerificare(new VerificaVIP());
        modVerificare.verificare();

        modVerificare.setStrategieVerificare(new VerificaTribuna());
        modVerificare.verificare();

        modVerificare.setStrategieVerificare(new VerificaPeluza());
        modVerificare.verificare();
    }
}
