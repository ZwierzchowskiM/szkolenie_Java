package exc10Discount;

public class DiscountApp {

    public static void main(String[] args) {
        Client client1 = new Client("Jan", "Kowalski", true);
        int price = 1100;

        Client client2 = new Client(null , "Nowak", true);
        int price2 = 1100;


        Client client3 = new Client("Jan" , null, true);
        int price3 = 1100;


        Client client4 = new Client(null , null, true);
        int price4 = 1100;

        DiscountService discountService = new DiscountService();
        double priceDiscount1 = discountService.calcPrice(client1, price);
        double priceDiscount2 = discountService.calcPrice(client2, price2);
        double priceDiscount3 = discountService.calcPrice(client3, price3);
        double priceDiscount4 = discountService.calcPrice(client4, price4);

        DiscountPrint discountPrint = new DiscountPrint();

        discountPrint.printSummary(client1, price,priceDiscount1);
        discountPrint.printSummary(client2, price2,priceDiscount2);
        discountPrint.printSummary(client3, price3,priceDiscount3);
        discountPrint.printSummary(client4, price4,priceDiscount4);


    }
}
