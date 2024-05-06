public class Main {
    public static void main(String[] args) {
        ACardBancar card = new CardBancar();
        System.out.println(card.getPlataOnline());
        System.out.println(card.getPlataPOS());

        ACardBancar cardDecorat = new DecoratorCard(card);
        System.out.println(cardDecorat.getPlataOnline());
        System.out.println(cardDecorat.getPlataPOS());
    }
}