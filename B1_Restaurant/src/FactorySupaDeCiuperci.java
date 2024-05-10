public class FactorySupaDeCiuperci implements IFactory {
    @Override
    public ISupa creareSupa() {
        return new SupaDeCiuperci();
    }
}
