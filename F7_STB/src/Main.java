public class Main {
    public static void main(String[] args) {
        ABilet bilet = new Bilet();
        System.out.println(bilet.getBilet());

        ABilet biletDeZiuaNationala = new DecoratorZiNationala(bilet);
        System.out.println(biletDeZiuaNationala.getBilet());
    }
}