public class FactoryBrancardier implements IFactory{
    @Override
    public IPersonal crearePersonal() {
        return new Brancardier();
    }
}
