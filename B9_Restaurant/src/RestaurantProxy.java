public class RestaurantProxy implements IRestaurant{
    private IRestaurant restaurant=new Restaurant();
    @Override
    public void realizeazaRezervare(int nrPersoane) {
        if(nrPersoane>=4){
            restaurant.realizeazaRezervare(nrPersoane);
        }
        else{
            System.out.println("Rezervarea pentru " + nrPersoane + " nu este posibila! " +
                    "Va rugam sa veniti direct la restaurant, sunt suficiente locuri la mesele de doua persoane");
        }
    }
}
