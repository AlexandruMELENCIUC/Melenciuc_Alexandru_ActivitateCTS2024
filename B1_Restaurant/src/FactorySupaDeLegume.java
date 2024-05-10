public class FactorySupaDeLegume implements IFactory {
    @Override
    public ISupa creareSupa() {
        return new SupaDeLegume();
    }
}
