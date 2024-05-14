public class Main {
    public static void main(String[] args) {

        Pacient pacient = new Pacient("Vasile Pofira");
        Medic medic = new Medic("Andrei Paun");
        GestiuneSalon salon = new GestiuneSalon();

        Facade.verificaPacient(pacient, medic, salon);

    }
}
