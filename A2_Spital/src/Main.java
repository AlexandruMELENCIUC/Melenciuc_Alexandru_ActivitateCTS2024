public class Main {
    public static void main(String[] args) {
        PersonalFactory factory = new PersonalFactory();

        IPersonal personal=null;
        try {
            personal=factory.crearePersonal(EPersonal.Asistent);
        } catch (Exception e) {
            e.printStackTrace();
        }
        personal.afisareDescriere();
    }
}