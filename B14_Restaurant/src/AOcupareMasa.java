public abstract class AOcupareMasa {
    abstract void curataMasa();
    abstract void asazaServetele();
    abstract void asazaTacamuri();
    abstract void invitaPersoane();

    public final void executaOcupareMasa() {
        curataMasa();
        asazaServetele();
        asazaTacamuri();
        invitaPersoane();
    }
}
