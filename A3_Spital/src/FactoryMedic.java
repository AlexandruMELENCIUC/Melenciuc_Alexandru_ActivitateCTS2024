public class FactoryMedic implements IFactory{
    @Override
    public IPersonal crearePersonal() {
        return new Medic();
    }
}
