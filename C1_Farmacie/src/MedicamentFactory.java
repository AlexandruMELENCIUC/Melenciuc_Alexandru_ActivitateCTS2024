public class MedicamentFactory {
    public AMedicament creareMedicament(ETipMedicamente tipMedicament, float pret, String denumire) throws Exception {
        switch (tipMedicament) {
            case Durere:
                return new Durere(pret, denumire);
            case Body:
                return new Body(pret, denumire);
            case Raceala:
                return new Raceala(pret, denumire);
            default:
                throw new Exception("Nu este tip de medicament valid!");
        }
    }
}
