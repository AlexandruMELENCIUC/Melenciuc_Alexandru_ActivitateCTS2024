public class Main {
    public static void main(String[] args) {

        IFactory factory = null;
        factory = new FactoryPersoanaFizica();

        IClient servicii = null;
        servicii = factory.creareServicii();
        servicii.afisareDescriere();
    }
}