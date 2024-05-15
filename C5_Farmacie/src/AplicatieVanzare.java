public class AplicatieVanzare implements IAplicatie {
    private int id;

    @Override
    public void setareMedicament(int id) {
        this.id = id;
        System.out.println("Setare ID medicament: " + this.id);
    }

    @Override
    public boolean verificareDisponibilitate(int nrMedicament) {
        System.out.println("Verificare disponibilitate pentru medicament: " + nrMedicament);
        return true;
    }
}
