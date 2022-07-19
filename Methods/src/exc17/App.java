package exc17;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int sum=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ile liczb chcesz wprowadzić: ");

        int numberOfElements = scanner.nextInt();

        while (numberOfElements-- > 0) {
            System.out.println("Podaj liczbe:");
            sum = sum + scanner.nextInt();


        }

        System.out.println("Suma liczb jest równa: " + sum);
    }
}
