public class OcupareMasa extends AOcupareMasa {
    @Override
    void curataMasa() {
        System.out.println("Curatarea mesei.");
    }

    @Override
    void asazaServetele() {
        System.out.println("Asezarea servetelelor.");
    }

    @Override
    void asazaTacamuri() {
        System.out.println("Asezarea tacamurilor.");
    }

    @Override
    void invitaPersoane() {
        System.out.println("Invitarea persoanelor sa se aseze la masa.");
    }
}
