package exc8tel.logic;

import exc8tel.model.Telephone;

public class Charger {

    public void charge (Telephone telephone) {
        telephone.setChargeLevel(telephone.getChargeLevel() + 1 );
        System.out.println("Laduje telefon");
    }


}
