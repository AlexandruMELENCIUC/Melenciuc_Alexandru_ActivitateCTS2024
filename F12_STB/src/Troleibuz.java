public class Troleibuz extends AHandler {
    @Override
    void procesareCalatorie(Calatorie calatorie) {
        if(calatorie.getNrKm()<=3) {
            System.out.println("Calatoria pana in statia " + calatorie.getDenumireStatie() + " poate fi parcursa cu troleibuzul.");
        } else {
            System.out.println("Troleibuzul nu ajunge in statia " + calatorie.getDenumireStatie());
            if(this.getNextHandler()!=null)
                this.getNextHandler().procesareCalatorie(calatorie);
        }
    }
}
