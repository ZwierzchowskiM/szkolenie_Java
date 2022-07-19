package exc15Scanner;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwsza liczbe: ");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj dzialanie do wykonania: ");
        String toDo = scanner.nextLine();

        System.out.println("Podaj druga liczbe: ");
        int b = scanner.nextInt();


        Check check = new Check();

        if (check.checkInput(toDo)) {

            int result = switch (toDo) {
                case "+" -> a + b;
                case "-" -> a - b;
                case "*" -> a * b;
                case "/" -> a / b;
                default -> 0;

            };
            System.out.println("Wynik to: "+result);
        } else System.out.println("Podano bledny znak");

    }




}
