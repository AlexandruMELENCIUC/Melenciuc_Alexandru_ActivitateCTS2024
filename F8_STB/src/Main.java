
public class Main {
    public static void main(String[] args) {
        IAutobuz autobuz = new Autobuz();
        IAutobuz autobuzProxy = new AutobuzProxy();

        autobuz.opresteInStatie();
        autobuzProxy.opresteInStatie();
    }
}