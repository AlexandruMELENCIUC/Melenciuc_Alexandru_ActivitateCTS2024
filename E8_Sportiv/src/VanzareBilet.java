public class VanzareBilet implements IVanzareBilet{
    @Override
    public void vanzareBilet(Client client) {
        System.out.println("Bilet vandut lui " + client.getNume() + " in varsta de " + client.getVarsta() + " ani.");
    }
}
