public class Main {
    public static void main(String[] args) {

        IFactory factory = null;
        factory = new FactoryDurere();

        AMedicament medicament = null;
        medicament = factory.creareMedicament(34, "Advil");
        medicament.fabrica();
    }
}