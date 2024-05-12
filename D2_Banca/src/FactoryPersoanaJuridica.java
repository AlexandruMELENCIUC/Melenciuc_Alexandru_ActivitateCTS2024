public class FactoryPersoanaJuridica implements IFactory {

    @Override
    public IClient creareServicii() {
        return new PersoanaJuridica();
    }
}
