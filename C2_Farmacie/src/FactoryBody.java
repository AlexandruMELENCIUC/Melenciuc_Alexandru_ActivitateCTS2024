public class FactoryBody implements IFactory {
    @Override
    public AMedicament creareMedicament(float pret, String denumire) {
        return new Durere(pret, denumire);
    }
}
