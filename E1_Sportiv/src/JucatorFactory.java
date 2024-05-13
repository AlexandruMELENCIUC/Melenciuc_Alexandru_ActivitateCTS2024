public class JucatorFactory {
    public IJucator creareJucator(ETipJucator tipJucator) throws Exception {
        switch (tipJucator) {
            case Portar:
                return new Portar();
            case Fundas:
                return new Fundas();
            case Atacant:
                return new Atacant();
            default:
                throw new Exception("Nu este un tip de jucator valid!");
        }
    }
}
