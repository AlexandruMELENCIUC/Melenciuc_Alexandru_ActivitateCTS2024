public class DecoratorCard extends ADecoratorCard{
    public DecoratorCard(ACardBancar card) {
        super(card);
    }

    @Override
    String getPlataOnline() {
        return super.getPlataOnline();
    }

    @Override
    String getPlataPOS() {
        return super.getPlataPOS() + " sau ContactLess";
    }
}
