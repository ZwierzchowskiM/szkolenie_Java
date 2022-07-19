package exc9.app;

import exc9.logic.Logic;

import java.util.Random;

public class App {
    public static void main(String[] args) {

        Random random = new Random();
        Logic logic = new Logic();
//        int number = random.nextInt(10000);
        int number = 1145;
        System.out.println("Wylosowana liczba to: " + number);
        logic.printNumberInfo(number);

        int result = logic.changeNumber(number);
        System.out.println("Liczba po modyfikacji to: " + result);

    }
}
