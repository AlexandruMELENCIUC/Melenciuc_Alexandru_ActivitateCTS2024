public class Main {
    public static void main(String[] args) {
        ABonDeCasa bon = new BonDeCasa();
        System.out.println(bon.getBon());

        ABonDeCasa bonDecorat = new DecoratorSarbatori(bon);
        System.out.println(bonDecorat.getBon());
    }
}