public class Main {
    public static void main(String[] args) {

        IFactory factory = null;
        factory = new FactoryMedic();

        IPersonal personal=null;
        personal = factory.crearePersonal();
        personal.afisareDescriere();

    }
}