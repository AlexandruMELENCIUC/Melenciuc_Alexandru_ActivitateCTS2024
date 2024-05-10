public class FactoryAsistent implements IFactory{
    @Override
    public IPersonal crearePersonal() {
        return new Asistent();
    }
}
