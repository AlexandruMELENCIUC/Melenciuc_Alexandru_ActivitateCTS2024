public class Main {
    public static void main(String[] args) {
        String CNP = "123456789";
        String serieBilet = "ABC123";

        Persoana persoana = new Persoana("Marcel" , CNP, serieBilet);

        Facade stadion = new Facade();
        stadion.verificaPersoana(persoana);
    }
}
