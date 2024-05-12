public class CreditFactory {
    public ICredit creareCredit(ETipCredit tipCredit) throws Exception {
        switch (tipCredit) {
            case NevoiPersonale:
                return new NevoiPersonale();
            case Ipotecar:
                return new Ipotecar();
            default:
                throw new Exception("Nu este tip de credit valid!");
        }
    }
}
