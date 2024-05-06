public class VanzareBiletProxy implements IVanzareBilet{
    private IVanzareBilet bilet = new VanzareBilet();
    @Override
    public void vanzareBilet(Client client) {
        if(client.getVarsta() >= 14){
            bilet.vanzareBilet(client);
        } else {
            System.out.println("Biletul nu poate fi vandut lui " + client.getNume() + " deoarece varsta lui ("
                    + client.getVarsta() + ") este mai mica de 14 ani!");
        }
    }
}
