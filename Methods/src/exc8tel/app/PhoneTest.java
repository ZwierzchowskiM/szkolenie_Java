package exc8tel.app;

import exc8tel.logic.Charger;
import exc8tel.model.Telephone;

public class PhoneTest {
    public static void main(String[] args) {
        Telephone telephone = new Telephone("Samsung" , "Galaxy S10",4500,90);
        Charger charger = new Charger();
        String info = telephone.printInfo();
        System.out.println(info);
        charger.charge(telephone);
        info = telephone.printInfo();
        System.out.println(info);

    }



}
