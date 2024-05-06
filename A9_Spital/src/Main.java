public class Main {
    public static void main(String[] args) {
        ISpital spital = new Spital();
        ISpital spitalProxy = new SpitalProxy();

        Pacient p1 = new Pacient("Viorel", true);
        Pacient p2 = new Pacient("Marius", false);

        spital.internarePacient(p1.getNume(),p1.areAsigurare());
        spitalProxy.internarePacient(p1.getNume(),p1.areAsigurare());

        spital.internarePacient(p2.getNume(),p2.areAsigurare());
        spitalProxy.internarePacient(p2.getNume(),p2.areAsigurare());
    }
}