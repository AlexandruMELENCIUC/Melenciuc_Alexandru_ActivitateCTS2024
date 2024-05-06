public abstract class ADecoratorBonDeCasa extends ABonDeCasa{
    protected ABonDeCasa bonDeCasa;

    public ADecoratorBonDeCasa(ABonDeCasa bonDeCasa) {
        this.bonDeCasa = bonDeCasa;
    }

    @Override
    String getBon() {
        return bonDeCasa.getBon();
    }
}
