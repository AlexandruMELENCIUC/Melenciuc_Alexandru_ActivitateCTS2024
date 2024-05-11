public class Durere extends AMedicament {
    public Durere(float pret, String denumire) {
        super(pret, denumire);
    }

    @Override
    public void fabrica() {
        System.out.println("Medicamentul pentru durere " + this.toString());
    }
}
