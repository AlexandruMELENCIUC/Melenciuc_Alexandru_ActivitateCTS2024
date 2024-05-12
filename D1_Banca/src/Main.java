public class Main {
    public static void main(String[] args) {

        CreditFactory factory = new CreditFactory();

        ICredit credit = null;
        try {
            credit = factory.creareCredit(ETipCredit.Ipotecar);
        } catch (Exception e) {
            e.printStackTrace();
        }
        credit.afisareDescriere();

    }
}