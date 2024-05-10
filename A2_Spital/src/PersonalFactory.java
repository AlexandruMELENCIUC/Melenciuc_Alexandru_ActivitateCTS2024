public class PersonalFactory {
    public IPersonal crearePersonal(EPersonal tipPersonal) throws Exception {
        switch (tipPersonal) {
            case Brancardier:
                return new Brancardier();
            case Asistent:
                return new Asistent();
            case Medic:
                return new Medic();
            default:
                throw new Exception("Nu este tip de personal valid!");
        }
    }
}
