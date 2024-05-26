public class AchizitieMedicamente extends AAchizitieMedicamente {

    @Override
    void primesteReteta() {
        System.out.println("Reteta primita.");
    }

    @Override
    boolean verificaStoc() {
        System.out.println("Verificare stoc medicamente.");
        return true;
    }

    @Override
    void aduceMedicamente() {
        System.out.println("Medicamentele sunt aduse din depozit.");
    }

    @Override
    void incaseazaBanii() {
        System.out.println("Banii sunt incasati.");
    }

    @Override
    void scadeDinStoc() {
        System.out.println("Medicamentele sunt scazute din stoc.");
    }

    @Override
    void emiteBon() {
        System.out.println("Bonul este emis.");
    }
}
