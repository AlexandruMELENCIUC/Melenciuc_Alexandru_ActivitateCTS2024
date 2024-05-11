public class Main {
    public static void main(String[] args) {
        //fara prototypeFactory
        AReteta reteta1 = new RetetaMedicament();
        System.out.println(reteta1);
        AReteta reteta2 = (RetetaMedicament) reteta1.clone();
        System.out.println(reteta2);

        //cu prototype
        AReteta reteta3 = PrototypeFactory.getPrototipReteta("reteta");
        if (reteta3 != null) {
            reteta3.setId("1");
            System.out.println(reteta3);
        }

        reteta3.modifListaCantitatiSolutii(1, "Solutie 3, 12mg");
        System.out.println(reteta3);
    }
}