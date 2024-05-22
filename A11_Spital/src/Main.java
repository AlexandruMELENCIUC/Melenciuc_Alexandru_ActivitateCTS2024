public class Main {
    public static void main(String[] args) {

        ModPlata modPlata = new ModPlata();

        modPlata.setStrategiePlata(new PlataCard());
        modPlata.efectueazaPlata(1350.0f);

        modPlata.setStrategiePlata(new PlataCash());
        modPlata.efectueazaPlata(457.5f);
    }
}