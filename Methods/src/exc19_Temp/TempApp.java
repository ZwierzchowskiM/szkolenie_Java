package exc19_Temp;

import java.awt.*;
import java.util.Scanner;

public class TempApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int actTemp;
        int expectTemp;

        System.out.println("Podaj aktualna temperature");
        actTemp = scanner.nextInt();
        double actTempDouble = actTemp;

        System.out.println("Podaj zadana temperature");
        expectTemp = scanner.nextInt();

        while (actTempDouble != expectTemp) {
            if (actTempDouble < expectTemp)
                actTempDouble+=0.5;
            else actTempDouble-=0.5;

            System.out.println("Atkualna temperatura: " + actTempDouble);

        }

        System.out.println("Osiągnięto zadaną temperaturę");
    }
}
