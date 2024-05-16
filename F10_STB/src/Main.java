public class Main {

    public static void main(String[] args) {
        ModPlata modPlata = new ModPlata();

        modPlata.setStrategiePlata(new PlataCardBancar());
        modPlata.efectueazaPlata(50.0f);

        modPlata.setStrategiePlata(new PlataSMS());
        modPlata.efectueazaPlata(3.5f);

        modPlata.setStrategiePlata(new PlataCardCalatorii());
        modPlata.efectueazaPlata(13.0f);
    }
}
