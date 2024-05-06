public class FarmacieProxy implements IFarmacie{
    private IFarmacie farmacie = new Farmacie();
    @Override
    public void achizitieMedicament(String numeMedicament, boolean areReteta) {
        if(areReteta) {
            farmacie.achizitieMedicament(numeMedicament, true);
        }else {
            System.out.println("Nu se poate achizitiona medicamentul " + numeMedicament + " fara reteta!");
        }
    }
}
