public class PlataCash implements IPlata {
    @Override
    public void efectueazaPlata(float suma) {
        System.out.println("A fost efectuata o plata CASH in valoare de " + suma + " lei.");
    }
}
