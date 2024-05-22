public abstract class AInternarePacient {
    abstract void analizaStarePacient();
    abstract void verificareDisponibilitatePat();
    abstract void emitereFisaInternare();

    public final void executaInternare() {
        analizaStarePacient();
        verificareDisponibilitatePat();
        emitereFisaInternare();
    }
}
