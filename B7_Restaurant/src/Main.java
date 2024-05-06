public class Main {
    public static void main(String[] args) {
        ANotaDePlata nota = new NotaDePlata();
        System.out.println(nota.getNota());

        ANotaDePlata notaDecorata = new DecoratorSarbatori(nota);
        System.out.println(notaDecorata.getNota());
    }
}