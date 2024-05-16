public class PlataSMS implements IPlata {
    @Override
    public void efectueazaPlata(float suma) {
        System.out.println("A fost efectuata o plata, prin SMS, in valoare de " + suma + " lei.");
    }
}
