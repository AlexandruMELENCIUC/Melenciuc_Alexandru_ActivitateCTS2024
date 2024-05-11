public class Main {
    public static void main(String[] args) {
        SupaFactory supaFactory = new SupaFactory();
        ISupa supa = null;
        try {
            supa = supaFactory.creareSupa(ESupe.SupaDeCiuperci);
        } catch (Exception e) {
            e.printStackTrace();
        }
        supa.afisareIngrediente();
    }
}