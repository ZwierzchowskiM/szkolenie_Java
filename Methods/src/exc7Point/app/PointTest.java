package exc7Point.app;

import exc7Point.data.Point;
import exc7Point.logic.PointController;

import java.util.Scanner;

public class PointTest {
    public static void main(String[] args) {

        Point point = new Point(100, 100);
        Scanner scan = new Scanner(System.in);
        PointController pointController = new PointController();

        boolean dzialanieProgramu = true;

        final int addX = 1;
        final int addY = 2;
        final int minusX = 3;
        final int minusY = 4;

        System.out.println("Opis dzialaia programu: ");
        System.out.println("1 - przesuniecie X w prawo");
        System.out.println("2 - przesuniecie X w lewo");
        System.out.println("3 - przesuniecie Y w prawo");
        System.out.println("4 - przesuniecie Y w lewo");

        while (dzialanieProgramu) {
            System.out.println("Podaj wartosc: ");
            int userInput = scan.nextInt();

            switch (userInput) {
                case addX -> pointController.addX(point);
                case addY -> pointController.minusX(point);
                case minusX -> pointController.addY(point);
                case minusY -> pointController.minusY(point);
                case 5 -> dzialanieProgramu = false;
                default -> System.out.println("Bledna opcja");
            }
            point.printInfo();
        }


    }
}
