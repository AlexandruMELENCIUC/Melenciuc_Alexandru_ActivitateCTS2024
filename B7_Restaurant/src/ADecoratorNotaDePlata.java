public abstract class ADecoratorNotaDePlata extends ANotaDePlata{
    protected ANotaDePlata notaDePlata;

    public ADecoratorNotaDePlata(ANotaDePlata notaDePlata) {
        this.notaDePlata = notaDePlata;
    }

    @Override
    String getNota() {
        return notaDePlata.getNota();
    }
}
