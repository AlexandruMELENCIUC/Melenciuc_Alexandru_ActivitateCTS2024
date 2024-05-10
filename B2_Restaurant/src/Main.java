public class Main {
    public static void main(String[] args) {

        OptiuniBuilder builder = new OptiuniBuilder();
        Optiuni rezervare = builder.setAreAsezareLaGeam(false).setAreGenMuzica(false).setAreMasaDecorata(false).setAreMuzicaPersonalizata(false).setAreScaunErgonomic(false).build();

        System.out.println(rezervare);
    }
}