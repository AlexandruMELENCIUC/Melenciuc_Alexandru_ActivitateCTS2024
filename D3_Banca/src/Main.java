public class Main {
    public static void main(String[] args) {
        FacilitatiBuilder builder = new FacilitatiBuilder();
        Facilitati cont = builder.setPrimesteSalariu(false).setAreCardAtasat(false).setAreInternetBanking(false).build();

        System.out.println(cont);
    }
}