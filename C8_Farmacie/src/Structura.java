import java.util.ArrayList;
import java.util.List;

public class Structura extends ANod {
    List<ANod> structura = new ArrayList<>();
    String denumireStructura;

    public Structura(String denumireStructura) {
        super();
        this.denumireStructura = denumireStructura;
    }

    @Override
    public String getDenumire() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getPret() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getInfo() {
        String info = "";
        info += this.denumireStructura + "\n";
        for (ANod n : structura) {
            info += "  " + n.getInfo();
            info += "\n";
        }
        return info;
    }

    @Override
    public void adaugaNod(ANod copil) {
        structura.add(copil);
    }

    @Override
    public void stergeNod(ANod copil) {
        structura.remove(copil);
    }

    @Override
    public ANod getNod(int i) {
        return structura.get(i);
    }
}
