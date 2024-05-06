public class DecoratorSarbatori extends ADecoratorNotaDePlata{
    public DecoratorSarbatori(ANotaDePlata notaDePlata) {
        super(notaDePlata);
    }

    @Override
    String getNota() {
        return super.getNota() + " La multi ani!";
    }
}
