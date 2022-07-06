package exc3;

public class Offer {
    Product product;
    double price;
    boolean special;

    Offer (Product prod, double pr, boolean spec) {
        product = prod;
        price = pr;
        special = spec;

    }
        void printInfo () {
            System.out.println(product.name + " " + product.producer + " " + price + "zł," + "oferta specjalna? " + special);

        }
}
