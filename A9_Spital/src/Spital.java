public class Spital implements ISpital{
    @Override
    public void internarePacient(String numePacient, boolean areAsigurare) {
        System.out.println("Pacientul " + numePacient + " a fost internat.");
    }
}
