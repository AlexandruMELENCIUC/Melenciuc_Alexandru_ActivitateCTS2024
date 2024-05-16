public class PlataCardBancar implements IPlata {
    @Override
    public void efectueazaPlata(float suma) {
        System.out.println("A fost efectuata o plata cu cardul bancar, in valoare de " + suma + " lei.");
    }
}
