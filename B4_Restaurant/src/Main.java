public class Main {
    public static void main(String[] args) {
        //fara prototypeFactory
        AClient client1 = new Client();
        System.out.println(client1);
        AClient client2 = (Client) client1.clone();
        System.out.println(client2);

        //cu prototype
        AClient client3 = PrototypeFactory.getPrototipClient("nume");
        System.out.println(client3);
        if (client3 != null) {
            client3.setId("123");
            System.out.println(client3);
        }
    }
}