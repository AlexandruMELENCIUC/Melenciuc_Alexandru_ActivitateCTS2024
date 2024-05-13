public class FactoryFundas implements IFactory {

    @Override
    public IJucator creareJucator() {
        return new Fundas();
    }
}
