package exc18Hospital;

import java.util.Scanner;

public class Hospital {

    private int numberOfPatient =0;
    Patient[] patientsTab = new Patient[10];

    void addPatient () {
        if (numberOfPatient<10) {

            patientsTab[numberOfPatient] = readPatient ();
            numberOfPatient++;
        } else {
            System.out.println("Zbyt duzo pacjentow!!!");
        }

    }

    void printList (){
        System.out.println("Lista pacjentow: ");
        for (int i = 0; i < numberOfPatient; i++) {
            patientsTab[i].printPatient();
        }
    }

    public Patient readPatient () {
        Scanner scanner = new Scanner(System.in);

        Patient newPaient = new Patient();
        System.out.println("Podaj imie pacjenta: ");
        newPaient.setFirstName(scanner.nextLine());
        System.out.println("Podaj nazwisko pacjenta: ");
        newPaient.setLastName(scanner.nextLine());
        System.out.println("Podaj pesel pacjenta: ");
        newPaient.setPesel(scanner.nextLine());

        return newPaient;
    }
}
