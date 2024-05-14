public class Facade {
    public static boolean verificaPacient(Pacient pacient, Medic medic, GestiuneSalon salon) {
        boolean gravitate = pacient.verificaGravitate();
        if (gravitate) {
            boolean confirmareMedic = medic.confirmareInternare(pacient);
            if (confirmareMedic) {
                System.out.println("Pacientul poate fi internat.");
                return true;
            } else {
                System.out.println("Medicul nu a confirmat internarea.");
            }
        } else {
            System.out.println("Starea pacientului nu este suficient de grava pentru internare.");
        }
        return false;
    }
}
