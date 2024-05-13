public class FactoryAtacant implements IFactory {

    @Override
    public IJucator creareJucator() {
        return new Atacant();
    }
}
