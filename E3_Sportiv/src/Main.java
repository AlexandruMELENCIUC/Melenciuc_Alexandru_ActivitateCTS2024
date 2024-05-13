public class Main {
    public static void main(String[] args) {
        OptiuniBuilder builder = new OptiuniBuilder();
        Optiuni rezervare = builder.setAreMancareInclusa(false).setAreScaunErgonomic(false).setAreBauturaInclusa(false).setAreMuzicaPersonalizata(false).setAreGenMuzica(false).builder();

        System.out.println(rezervare);
    }
}