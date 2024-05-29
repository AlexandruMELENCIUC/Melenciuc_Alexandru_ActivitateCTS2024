public class Main {
    public static void main(String[] args) {
        Troleibuz troleibuz = new Troleibuz();
        Autobuz autobuz = new Autobuz();
        Tramvai tramvai = new Tramvai();
        Metrou metrou = new Metrou();

        troleibuz.setNextHandler(autobuz);
        autobuz.setNextHandler(tramvai);
        tramvai.setNextHandler(metrou);

        Calatorie calatorie1 = new Calatorie("Universitate", 2);
        Calatorie calatorie2 = new Calatorie("Romana", 4);
        Calatorie calatorie3 = new Calatorie("Victoriei", 6);
        Calatorie calatorie4 = new Calatorie("Pipera", 11);

        System.out.println("CALATORIA 1");
        troleibuz.procesareCalatorie(calatorie1);
        tramvai.procesareCalatorie(calatorie1);

        System.out.println("\nCALATORIA 2");
        troleibuz.procesareCalatorie(calatorie2);

        System.out.println("\nCALATORIA 3");
        troleibuz.procesareCalatorie(calatorie3);

        System.out.println("\nCALATORIA 4");
        troleibuz.procesareCalatorie(calatorie4);

    }
}