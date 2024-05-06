import java.util.ArrayList;
import java.util.List;

public class Autobuz implements IAutobuz{
    private List<Calator> listaCalatori = new ArrayList<>();

    public List<Calator> getListaCalatori() {
        return listaCalatori;
    }

    public void adaugaCalator(Calator calator){
        listaCalatori.add(calator);
    }

    @Override
    public void opresteInStatie() {
        System.out.println("Autobuzul opreste in statie indiferent de numarul de calatori.");
    }

}
