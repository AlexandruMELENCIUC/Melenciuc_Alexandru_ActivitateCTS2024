public class Main {
    public static void main(String[] args) {

        IFactory factory = null;
        factory = new FactorySupaDeVita();

        ISupa supa = null;
        supa = factory.creareSupa();
        supa.afisareIngrediente();
    }
}