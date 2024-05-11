import java.util.ArrayList;

public abstract class AReteta implements Cloneable {
    private String id;
    protected String nume;
    protected ArrayList<String> listaCantitatiSolutii;

    public void modifListaCantitatiSolutii(int i, String cantitateNoua) {
        listaCantitatiSolutii.set(i, cantitateNoua);
    }

    abstract void detaliiReteta();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTip() {
        return nume;
    }

    public ArrayList<String> getListaCantitatiSolutii() {
        return listaCantitatiSolutii;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("AReteta [id=");
        builder.append(id);
        builder.append(", nume=");
        builder.append(nume);
        builder.append(", listaCantitatiSolutii=");
        builder.append(listaCantitatiSolutii);
        builder.append("]");
        return builder.toString();
    }

    @Override
    public AReteta clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (AReteta) clone;
    }
}
