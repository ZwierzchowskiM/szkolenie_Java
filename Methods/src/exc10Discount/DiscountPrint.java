package exc10Discount;

public class DiscountPrint {

    public void printSummary (Client client, int price, double discountPrice){
        printWelcome(client);
        printPrice(price, discountPrice);
    }

    private void printPrice(int price, double discountPrice) {
        System.out.println("Kwota przed rabatem: " + price);
        System.out.println("Kwota po rabacie: " + discountPrice);
    }

    private void printWelcome(Client client) {
        String firstName = client.getFirstName();
        String lastName = client.getLastName();
        String welcome;

        if  (firstName == null && lastName == null) welcome = "Witaj nieznajomy";
        else if (firstName == null) welcome = "Dzien dobry panie " + lastName;
        else if (lastName == null) welcome = "Witaj " + firstName;
        else welcome = "Witaj " + firstName + " " + lastName;
        System.out.println(welcome);
    }
}
