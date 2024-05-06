public abstract class ADecoratorCard extends ACardBancar{
    protected ACardBancar card;

    public ADecoratorCard(ACardBancar card) {
        this.card = card;
    }

    @Override
    String getPlataOnline() {
        return card.getPlataOnline();
    }

    @Override
    String getPlataPOS() {
        return card.getPlataPOS();
    }
}
