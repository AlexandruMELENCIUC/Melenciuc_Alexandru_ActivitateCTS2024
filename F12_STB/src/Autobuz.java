public class Autobuz extends AHandler{
    @Override
    void procesareCalatorie(Calatorie calatorie) {
        if(calatorie.getNrKm()>3 && calatorie.getNrKm()<=5) {
            System.out.println("Calatoria pana in statia " + calatorie.getDenumireStatie() + " poate fi parcursa cu autobuzul.");
        } else if(calatorie.getNrKm()<=3) {
            System.out.println("Nu trebuia sa ajunga aici!");
        } else {
            System.out.println("Autobuzul nu ajunge in statia " + calatorie.getDenumireStatie());
            if(this.getNextHandler()!=null) {
                this.getNextHandler().procesareCalatorie(calatorie);
            } else {
                System.out.println("Nu exista mijloc de transport care sa ajunga in statia " + calatorie.getDenumireStatie());
            }
        }
    }
}
