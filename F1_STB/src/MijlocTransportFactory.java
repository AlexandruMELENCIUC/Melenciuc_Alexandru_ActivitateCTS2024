public class MijlocTransportFactory {
    public IMijlocTransport creareMijlocTransport(ETipMijlocTransport tipMijlocTransport) throws Exception {
        switch (tipMijlocTransport) {
            case Autobuz:
                return new Autobuz();
            case Tramvai:
                return new Tramvai();
            case Troleibuz:
                return new Troleibuz();
            default:
                throw new Exception("Nu este un tip de mijloc de transport valid!");
        }
    }
}
