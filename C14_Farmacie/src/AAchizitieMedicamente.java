public abstract class AAchizitieMedicamente {
    abstract void primesteReteta();
    abstract boolean verificaStoc();
    abstract void aduceMedicamente();
    abstract void incaseazaBanii();
    abstract void scadeDinStoc();
    abstract void emiteBon();

    public final void executaAchizitie() {
        primesteReteta();
        if (verificaStoc()) {
            aduceMedicamente();
            incaseazaBanii();
            scadeDinStoc();
            emiteBon();
        } else {
            System.out.println("Stoc insuficient, achizitia nu poate fi realizata.");
        }
    }
}
