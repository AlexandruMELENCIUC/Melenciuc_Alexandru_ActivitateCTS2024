public class FactoryPersoanaFizica implements IFactory {

    @Override
    public IClient creareServicii() {
        return new PersoanaFizica();
    }
}
