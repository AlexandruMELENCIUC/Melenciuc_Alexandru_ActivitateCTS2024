public class Main {
    public static void main(String[] args) {
        MijlocTransportFactory factory = new MijlocTransportFactory();

        IMijlocTransport mijlocTransport=null;
        try {
            mijlocTransport=factory.creareMijlocTransport(ETipMijlocTransport.Tramvai);
        } catch (Exception e) {
            e.printStackTrace();
        }
        mijlocTransport.afisareDescriere();
    }
}
