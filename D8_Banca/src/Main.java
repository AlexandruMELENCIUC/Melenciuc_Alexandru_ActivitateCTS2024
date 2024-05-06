public class Main {
    public static void main(String[] args) {
        ICredit credit = new Credit();
        ICredit creditProxy = new CreditProxy();

        Client c = new Client("Andreea");

        credit.acordaCredit(c,100, "RON");
        creditProxy.acordaCredit(c, 100, "RON");
        creditProxy.acordaCredit(c, 100, "EURO");
    }
}