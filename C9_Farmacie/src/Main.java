public class Main {
    public static void main(String[] args) {

        IFarmacie farmacie=new Farmacie();
        IFarmacie farmacieProxy = new FarmacieProxy();


        Client clientCuReteta = new Client("Marcel", 29, true);
        Client clientFaraReteta = new Client("Ioana", 20, false);

        farmacie.achizitieMedicament("Calmotusin", clientCuReteta.areReteta());
        farmacie.achizitieMedicament("No-Spa", clientFaraReteta.areReteta());

        farmacieProxy.achizitieMedicament("Algocalmin", clientCuReteta.areReteta());
        farmacieProxy.achizitieMedicament("Vimovo", clientFaraReteta.areReteta());
    }
}