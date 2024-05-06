public class DecoratorSarbatori extends ADecoratorBonDeCasa{
    public DecoratorSarbatori(ABonDeCasa bonDeCasa) {
        super(bonDeCasa);
    }

    @Override
    String getBon() {
        return super.getBon() + " La multi ani!";
    }
}
