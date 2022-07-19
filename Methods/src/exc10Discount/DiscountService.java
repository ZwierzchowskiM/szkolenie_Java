package exc10Discount;

public class DiscountService {

    public double calcPrice (Client client, double price){
        if (client.isPremium()){
            return calcDiscountPrice (client, price);
        }  else {
            return calcStandardPrice (client, price);
        }
    }

    private double calcDiscountPrice(Client client, double price) {
            if (price>1000) {
                return applyDiscount(price, 0.15);
            } else {
                return applyDiscount(price, 0.05);
            }
    }


    private double calcStandardPrice(Client client, double price) {
        if (price>1000) {
            return applyDiscount(price, 0.10);
        } else {
            return price;
        }
    }


    private double applyDiscount(double price, double discount) {
        return price*(1-discount);
    }

}
