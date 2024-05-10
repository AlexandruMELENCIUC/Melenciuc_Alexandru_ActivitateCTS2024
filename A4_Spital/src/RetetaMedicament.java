import java.util.ArrayList;

public class RetetaMedicament extends AReteta{
    public RetetaMedicament() {
        System.out.println("Incarcare reteta");
        listaCantitatiSolutii = new ArrayList<String>();
        listaCantitatiSolutii.add("solutie 1, 5 mg");
        listaCantitatiSolutii.add("solutie 2, 15 mg");
        this.nume = "CalmoTuSin";
    }

    @Override
    void detaliiReteta() {
        System.out.println("Reteta pentru medicamentul " + this.nume);
    }

    @Override
    public AReteta clone() {
        AReteta clone = (AReteta) super.clone();
        clone.listaCantitatiSolutii = new ArrayList<>(this.listaCantitatiSolutii);
        return clone;
    }
}
