public class Main {
    public static void main(String[] args) {
        JucatorFactory factory = new JucatorFactory();

        IJucator jucator = null;
        try {
            jucator = factory.creareJucator(ETipJucator.Atacant);
        } catch (Exception e) {
            e.printStackTrace();
        }
        jucator.afisareDescriere();
    }
}