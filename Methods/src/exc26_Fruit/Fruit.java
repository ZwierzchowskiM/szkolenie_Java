package exc26_Fruit;

public class Fruit {
    private int weight;
    private String type;

    Fruit ( int weight, String type) {
        this.weight = weight;
        this.type = type;
    }

    String getInfo () {
        return "Waga owocu: " + weight + ", typ owocu: " + type + " ";
    }
}
