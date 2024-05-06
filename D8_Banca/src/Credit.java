public class Credit implements ICredit{

    @Override
    public void acordaCredit(Client client, double suma, String moneda) {
        System.out.println("Credit acordat pentru " + client.getNume() + " in valoare de " + suma + " " + moneda + ".");
    }
}
