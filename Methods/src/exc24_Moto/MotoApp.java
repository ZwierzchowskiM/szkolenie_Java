package exc24_Moto;

public class MotoApp {

    public static void main(String[] args) {
        Tire tire = new Tire();
        tire.setSize(18);
        tire.setIdentificationNumber("12A45");

        tire.printInfo();
    }

}
