public class AplicatieVanzareNoua implements IAplicatieNoua {
    @Override
    public boolean verificaStocPentruMedicament(int id, int nrMedicament) {
        System.out.printf("Verificare stoc medicament! ");
        if (nrMedicament > 0) {
            System.out.println("Avem in stoc medicamentul: " + id + " in cantitatea de: " + nrMedicament);
            return true;
        } else {
            System.out.println("Medicamentul " + id + " nu este in stoc!");
            return false;
        }
    }
}
