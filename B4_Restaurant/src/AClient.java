public abstract class AClient implements Cloneable {
    private String id;
    protected String nume;
    protected String email;

    abstract void detaliiClient();

    public String getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public String getEmail() {
        return email;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Client [id=");
        builder.append(id);
        builder.append(", nume=");
        builder.append(nume);
        builder.append(", email=");
        builder.append(email);
        builder.append("]");
        return builder.toString();
    }

    @Override
    public AClient clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (AClient) clone;
    }
}
