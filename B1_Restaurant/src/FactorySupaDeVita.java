public class FactorySupaDeVita implements IFactory {
    @Override
    public ISupa creareSupa() {
        return new SupaDeVita();
    }
}
