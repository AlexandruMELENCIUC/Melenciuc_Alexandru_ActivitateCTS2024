public class Main {
    public static void main(String[] args) {
        //definire nivel 0 arborescenta
        Structura Spital = new Structura("Spitalul Universitar");

        //definire nivel 1 arborescenta
        ANod structuraDepartament1 = new Structura("Medicina interna");
        ANod structuraDepartament2 = new Structura("Recuperare");
        Spital.adauga(structuraDepartament1);
        Spital.adauga(structuraDepartament2);

        //definire noduri nivel 2 arborescenta (Subdepartamente)
        structuraDepartament1.adauga(new Sectie(" Chirurgie", 14));
        structuraDepartament1.adauga(new Sectie(" Sectie Gastroenterologie", 8));
        structuraDepartament2.adauga(new Sectie(" Patologie neurologica", 3));
        structuraDepartament2.adauga(new Sectie(" Patologie posttraumatica", 5));

        System.out.println(Spital.getInfo());
    }
}
