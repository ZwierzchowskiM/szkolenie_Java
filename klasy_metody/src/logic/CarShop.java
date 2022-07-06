package logic;

import data.Car;

public class CarShop {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.brand = "audi";
        audi.carColor = "blue";
        audi.doors = 4;

        String audiInfo = audi.brand + ", Kolor: " + audi.carColor + ", Liczba drzwi: " + audi.doors;

        System.out.println("Wybrałeś następujący samochód");
        System.out.println(audiInfo);
    }
}
