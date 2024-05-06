public class Restaurant implements IRestaurant{
    @Override
    public void realizeazaRezervare(int nrPersoane) {
        System.out.println("Rezervarea pentru " + nrPersoane + " persoane a fost realizata cu succes!");
    }
}
