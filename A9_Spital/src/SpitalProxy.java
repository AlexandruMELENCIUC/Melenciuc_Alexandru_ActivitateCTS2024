public class SpitalProxy implements ISpital{
    private ISpital spital = new Spital();
    @Override
    public void internarePacient(String numePacient, boolean areAsigurare) {
        if(areAsigurare){
            spital.internarePacient(numePacient, true);
        }
        else {
            System.out.println("Pacientul " + numePacient + " nu poate fi internat " +
                    "deoarece nu are asigurare!");
        }
    }
}
