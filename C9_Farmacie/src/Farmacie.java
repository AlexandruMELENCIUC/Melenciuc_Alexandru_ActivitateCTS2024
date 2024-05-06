public class Farmacie implements IFarmacie{
    @Override
    public void achizitieMedicament(String numeMedicament, boolean areReteta) {
        System.out.println("Medicamentul " + numeMedicament + " a fost achizitionat.");
    }
}
