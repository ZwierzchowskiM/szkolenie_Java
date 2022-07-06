package exc4;

public class HomeSim {
    public static void main(String[] args) {
        Home home1 = new Home(1000, 1000);
        home1.printInfo();
        home1.takeShower();
        home1.takeBath();
        home1.watchTv(5);
        System.out.println(home1.printInfo());

        home1.makeLunch("Jajka");
        System.out.println();

    }
}
