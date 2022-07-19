package exc26_Fruit;

public class Apple extends Fruit {
    private String variety;
final static String APPLE_TYPE = "Jablkowate";

    Apple (int weight, String variety) {
        super(weight, APPLE_TYPE);
        this.variety = variety;
    }

    @Override
    String getInfo() {
        return super.getInfo() + "Odmiana: " + variety;
    }
}
