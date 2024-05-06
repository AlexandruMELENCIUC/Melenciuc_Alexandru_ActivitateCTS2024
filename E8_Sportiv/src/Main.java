public class Main {
    public static void main(String[] args) {
        IVanzareBilet bilet = new VanzareBilet();
        IVanzareBilet biletProxy = new VanzareBiletProxy();

        Client cl1 = new Client("Vasile", 19);
        Client cl2 = new Client("Ion", 13);

        bilet.vanzareBilet(cl1);
        bilet.vanzareBilet(cl2);

        biletProxy.vanzareBilet(cl1);
        biletProxy.vanzareBilet(cl2);

    }
}