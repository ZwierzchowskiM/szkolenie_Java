package exc3;

public class Shop {
    public static void main(String[] args) {
        Product product1 = new Product("Czekolada mleczna", "Milka");
        Offer offer1 = new Offer(product1, 3.99, true);

        offer1.printInfo();

        product1.setName("New");
        offer1.printInfo();

    }
}
