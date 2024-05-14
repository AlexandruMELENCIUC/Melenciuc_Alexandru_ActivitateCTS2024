import java.util.ArrayList;

public class GestiuneSalon {
    private ArrayList<Paturi> paturi;

    public GestiuneSalon() {
        this.paturi = new ArrayList<>();
    }

    public void addPat(Paturi p) {
        this.paturi.add(p);
    }

}
