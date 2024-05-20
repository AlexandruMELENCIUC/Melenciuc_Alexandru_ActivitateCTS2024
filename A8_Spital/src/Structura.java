import java.util.ArrayList;
import java.util.List;

public class Structura extends ANod {
    private String numeStructura;
    private List<ANod> structura = new ArrayList<ANod>();

    public Structura(String numeStructura) {
        super();
        this.numeStructura = numeStructura;
    }

    @Override
    public String getDenumire() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getNrDoctori() {
        throw new UnsupportedOperationException();
    }


    @Override
    public String getInfo(){
        String info = "";
        info += this.numeStructura + "\n";
        for(ANod n: structura){
            info += " " + n.getInfo();
            info += "\n";
        }
        return info;
    }

    @Override
    public void adauga(ANod copil) {
        if(copil != null && structura!= null) {
            this.structura.add(copil);
        }
    }

    @Override
    public void sterge(ANod copil) {
        if(copil != null && structura!= null) {
            this.structura.remove(copil);
        }
    }

    @Override
    public ANod getCopil(int index) {
        if(structura!= null && index >= 0 && index < this.structura.size()
        ) {
            return this.structura.get(index);
        }
        return null;
    }
}
