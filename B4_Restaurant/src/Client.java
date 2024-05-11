public class Client extends AClient {
    public Client() {
        System.out.println("Incarcare date client din BD");
        this.nume = "Aurel";
        this.email = "aurel@email.com";
    }

    @Override
    void detaliiClient() {
        System.out.println("Clientul " + this.nume + " avand email:" + this.email + " a facut rezervarea.");

    }
}
