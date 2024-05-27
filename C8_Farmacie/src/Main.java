public class Main {
    public static void main(String[] args) {
        Structura farmacie = new Structura("Farmacie:");

        ANod structuraRaceala = new Structura("*Raceala:");
        ANod structuraDurere = new Structura("*Durere:");
        ANod structuraAntibiotice = new Structura("*Antibiotice:");
        farmacie.adaugaNod(structuraRaceala);
        farmacie.adaugaNod(structuraDurere);
        farmacie.adaugaNod(structuraAntibiotice);

        Structura medicamenteAdultiR = new Structura("Adulti");
        Structura medicamenteCopiiR = new Structura("Copii");
        Structura medicamenteAdultiD = new Structura("Adulti");
        Structura medicamenteCopiiD = new Structura("Copii");


        structuraDurere.adaugaNod(medicamenteCopiiD);
        structuraDurere.adaugaNod(medicamenteAdultiD);
        structuraRaceala.adaugaNod(medicamenteCopiiR);
        structuraRaceala.adaugaNod(medicamenteAdultiR);

        medicamenteAdultiD.adaugaNod(new Produs("MIG", 24));
        medicamenteAdultiD.adaugaNod(new Produs("Advil", 34));
        medicamenteCopiiR.adaugaNod(new Produs("Panadol", 20));
        medicamenteCopiiR.adaugaNod(new Produs("Nurofen", 31));
        medicamenteAdultiR.adaugaNod(new Produs("Nurofen", 36));
        medicamenteAdultiR.adaugaNod(new Produs("Paracetamol", 16));
        medicamenteCopiiD.adaugaNod(new Produs("Panadol kid", 20));
        medicamenteCopiiD.adaugaNod(new Produs("Nurofen kid", 31));
        structuraAntibiotice.adaugaNod(new Produs("Augmentin", 15));

        System.out.println(farmacie.getInfo());
    }
}