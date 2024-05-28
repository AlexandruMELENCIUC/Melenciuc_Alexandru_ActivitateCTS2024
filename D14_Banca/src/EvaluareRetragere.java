public class EvaluareRetragere extends AEvaluareRetragere {

    @Override
    void introducereCard() {
        System.out.println("Cardul a fost introdus...");
    }

    @Override
    void introducerePIN() {
        System.out.println("...PIN-ul a fost introdus...");
    }

    @Override
    void specificaSuma() {
        System.out.println("Suma solicitata:");
    }

    @Override
    void retragereBani() {
        System.out.println("Eliberare bani...");
    }

    @Override
    void retrageCard() {
        System.out.println("Retragere card.");
    }
}
