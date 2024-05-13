public class FactoryPortar implements IFactory {

    @Override
    public IJucator creareJucator() {
        return new Portar();
    }
}
