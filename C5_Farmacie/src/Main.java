public class Main {
    public static void main(String[] args) {
        IAplicatie aplicatie = new AplicatieVanzare();
        aplicatie.setareMedicament(1432);
        aplicatie.verificareDisponibilitate(234);

        IAplicatieNoua aplicatieNoua = new AplicatieVanzareNoua();
        aplicatieNoua.verificaStocPentruMedicament(2392, 454);

        AdaptorAplicatie adaptorAplicatie = new AdaptorAplicatie(aplicatie, aplicatieNoua);
        adaptorAplicatie.verificaStocPentruMedicament(4857, 0);
    }
}
