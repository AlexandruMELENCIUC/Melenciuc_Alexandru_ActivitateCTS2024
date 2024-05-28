public abstract class AEvaluareRetragere {
    abstract void introducereCard();
    abstract void introducerePIN();
    abstract void specificaSuma();
    abstract void retragereBani();
    abstract void retrageCard();

    public final void proceduraRetragere() {
        introducereCard();
        introducerePIN();
        specificaSuma();
        retragereBani();
        retrageCard();
    }
}
