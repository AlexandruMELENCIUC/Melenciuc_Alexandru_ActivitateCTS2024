public class AdaptorAplicatie extends AplicatieVanzareNoua implements IAplicatie{
    private IAplicatie aplicatie;
    private IAplicatieNoua aplicatieNoua;

    public AdaptorAplicatie(IAplicatie aplicatie, IAplicatieNoua aplicatieNoua) {
        super();
        this.aplicatie = aplicatie;
        this.aplicatieNoua = aplicatieNoua;
    }

    @Override
    public boolean verificaStocPentruMedicament(int id, int nrMedicament) {
        System.out.println("Verificare stoc folosind adaptor.");
        return super.verificaStocPentruMedicament(id, nrMedicament);
    }

    @Override
    public void setareMedicament(int id) {
        this.aplicatie.setareMedicament(id);

    }

    @Override
    public boolean verificareDisponibilitate(int nrMedicament) {
        return this.aplicatie.verificareDisponibilitate(nrMedicament);
    }
}
