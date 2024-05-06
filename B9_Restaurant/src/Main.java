public class Main {
    public static void main(String[] args) {

    IRestaurant restaurant = new Restaurant();
    IRestaurant restaurantProxy=new RestaurantProxy();

    Client cl1 = new Client("Laura", 3);
    Client cl2 = new Client("Alin", 5);

    restaurant.realizeazaRezervare(cl1.getNrPersoane());
    restaurantProxy.realizeazaRezervare(cl1.getNrPersoane());

    restaurant.realizeazaRezervare(cl2.getNrPersoane());
    restaurantProxy.realizeazaRezervare(cl2.getNrPersoane());

    }
}