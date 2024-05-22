public class InternarePacient extends AInternarePacient {
    @Override
    void analizaStarePacient() {
        System.out.println("Analiza starii pacientului.");
    }

    @Override
    void verificareDisponibilitatePat() {
        System.out.println("Verificare disponibilitate paturi in saloanele spitalului.");
    }

    @Override
    void emitereFisaInternare() {
        System.out.println("Emitere fisa de internare.");
    }
}
