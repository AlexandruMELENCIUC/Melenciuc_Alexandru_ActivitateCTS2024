public class Body extends AMedicament {
    public Body(float pret, String denumire) {
        super(pret, denumire);
    }

    @Override
    public void fabrica() {
        System.out.println("Medicamentul pentru body " + this.toString());
    }
}
