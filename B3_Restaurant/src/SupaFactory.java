public class SupaFactory {
    public ISupa creareSupa(ESupe tipSupa) throws Exception{
        switch (tipSupa) {
            case SupaDeCiuperci:
                return new SupaDeCiuperci();
            case SupaDeLegume:
                return new SupaDeLegume();
            case SupaDeVita:
                return new SupaDeVita();
            default:
                throw new Exception("Nu este un tip de supa valid!");
        }
    }
}
