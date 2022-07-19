package exc22_Car;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Car(22, true, false, true, false);

        car.start();
        car.status();
    }

}
