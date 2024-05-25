public class PlataCard implements IPlata {
    @Override
    public void efectueazaPlata(float suma) {
        System.out.println("A fost efectuata o plata cu cardul in valoare de " + suma + " lei.");
    }
}
