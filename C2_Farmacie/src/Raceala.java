public class Raceala extends AMedicament {
    public Raceala(float pret, String denumire) {
        super(pret, denumire);
    }

    @Override
    public void fabrica() {
        System.out.println("Medicamentul pentru raceala " + this.toString());
    }
}
