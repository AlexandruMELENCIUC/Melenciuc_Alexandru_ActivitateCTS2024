public class Main {
    public static void main(String[] args) {
        FacilitatiBuilder builder = new FacilitatiBuilder();
        Facilitati pacient = builder.setAreHalatInclus(false).setAreMicDejunInclus(false).setArePapuciDeCamera(false).setArePatRabatabil(false).build();

        System.out.println(pacient);
    }
}