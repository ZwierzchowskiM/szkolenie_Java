package exc18Hospital;

import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {
        int optionNumber =0;
        final int addPatient = 1;
        final int printList = 2;
        final int exitProgram = 0;
        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital();

        do {
            System.out.println("Wybierz interesujaca opcje: ");
            System.out.println(addPatient+ " - dodanie nowego pacjenta");
            System.out.println(printList+" - wyswietlenie listy pacjentow: ");
            System.out.println(exitProgram+ " - wyjscie z programu");
            optionNumber = scanner.nextInt();

            switch (optionNumber) {

                case exitProgram -> System.out.println("Zakonczenie programu");
                case addPatient -> hospital.addPatient();
                case printList -> hospital.printList();
                default -> System.out.println("Podano bleda opcje");
            }

        } while (optionNumber!=exitProgram);
        scanner.close();
    }
}
