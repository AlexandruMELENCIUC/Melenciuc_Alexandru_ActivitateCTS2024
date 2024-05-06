import java.util.List;

public class AutobuzProxy implements IAutobuz{
    private IAutobuz autobuz;

    public AutobuzProxy() {
        this.autobuz = new Autobuz();
    }

    @Override
    public List<Calator> getListaCalatori() {
        return autobuz.getListaCalatori();
    }

    @Override
    public void opresteInStatie() {
        if(autobuz.getListaCalatori().isEmpty()){
            System.out.println("Autobuzul nu opreste in statie deoarece nu sunt calatori!");
        } else {
            autobuz.opresteInStatie();
        }
    }
}
