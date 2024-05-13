public class Main {
    public static void main(String[] args) {

        IFactory factory = null;
        factory = new FactoryPortar();

        IJucator jucator = null;
        jucator = factory.creareJucator();
        jucator.afisareDescriere();
    }
}