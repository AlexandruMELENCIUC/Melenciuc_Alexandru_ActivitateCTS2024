public class DecoratorZiNationala extends ADecoratorBilet{
    public DecoratorZiNationala(ABilet bilet) {
        super(bilet);
    }

    @Override
    String getBilet() {
        return super.getBilet() + " La multi ani";
    }
}
