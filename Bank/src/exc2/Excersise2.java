package exc2;

public class Excersise2 {
    public static void main(String[] args) {
        obiekt auction1 = new obiekt();
        auction1.title = "Xbox One";
        auction1.description = "Konsola";
        auction1.price = 2000;

        seller seller1 = new seller();
        seller1.firstName = "Tom";
        seller1.lastName = "Jones";

        address address1 = new address();
        address1.city = "Wroclaw";

        seller1.adres = address1;

    }


}
