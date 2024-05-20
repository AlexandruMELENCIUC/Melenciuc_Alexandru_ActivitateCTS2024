public class Main {
    public static void main(String[] args) {
        Structura meniu = new Structura("Meniu restaurant:");

        ANod structuraStarter = new Structura(" Starter:");
        ANod structuraBauturi = new Structura(" Bauturi:");
        ANod structuraDesert = new Structura(" Desert:");

        meniu.adaugaNod(structuraBauturi);
        meniu.adaugaNod(structuraStarter);
        meniu.adaugaNod(structuraDesert);

        structuraBauturi.adaugaNod(new Produs("Cafea", 7));
        structuraBauturi.adaugaNod(new Produs("Apa plata", 5));
        structuraBauturi.adaugaNod(new Produs("Cola", 9));

        structuraStarter.adaugaNod(new Produs("Bruschette", 20));
        structuraStarter.adaugaNod(new Produs("Salata cu ton", 25));

        structuraDesert.adaugaNod(new Produs("Prajitura casei", 15));
        structuraDesert.adaugaNod(new Produs("Tort", 17));

        System.out.println(meniu.getInfo());

    }
}