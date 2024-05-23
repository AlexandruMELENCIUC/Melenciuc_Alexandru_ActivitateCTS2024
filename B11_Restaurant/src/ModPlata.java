public class ModPlata {
    private IPlata strategiePlata;

    public void setStrategiePlata(IPlata strategiePlata) {
        this.strategiePlata = strategiePlata;
    }

    public void efectueazaPlata(float suma) {
        strategiePlata.efectueazaPlata(suma);
    }
}
