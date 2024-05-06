public abstract class ADecoratorBilet  extends ABilet{
    protected ABilet bilet;

    public ADecoratorBilet(ABilet bilet) {
        this.bilet = bilet;
    }

    @Override
    String getBilet() {
        return bilet.getBilet();
    }
}
