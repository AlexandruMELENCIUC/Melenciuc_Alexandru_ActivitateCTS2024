public class Main {
    public static void main(String[] args) {
        OptiuniBuilder builder = new OptiuniBuilder();
        Optiuni factura =builder.setAreNumarPungi(false).setArePlataCuCard(false).setAreCardFidelitate(true).setAreCotaTVA(true).build();

        System.out.println(factura);

    }
}