public class CardBancar extends ACardBancar{

    @Override
    String getPlataOnline() {
        return "Plata se poate realiza Online";
    }

    @Override
    String getPlataPOS() {
        return "Plata se poate realiza la POS introducand cardul";
    }
}
