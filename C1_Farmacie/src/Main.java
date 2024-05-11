public class Main {
    public static void main(String[] args) {
        MedicamentFactory medicamentFactory = new MedicamentFactory();
        AMedicament medicament = null;
        try {
            medicament = medicamentFactory.creareMedicament(ETipMedicamente.Raceala, 12, "Paracetamol");
        } catch (Exception e) {
            e.printStackTrace();
        }
        medicament.fabrica();
    }
}