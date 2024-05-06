public class CreditProxy implements ICredit{
    private ICredit credit = new Credit();
    @Override
    public void acordaCredit(Client client, double suma, String moneda) {
        if(moneda.equals("RON")){
            credit.acordaCredit(client, suma, moneda);
        } else {
            System.out.println("Creditul nu poate fi acordat pentru clientul " + client.getNume() + " Se accepta doar RON!");
        }
    }
}
