package exc9.logic;

public class Logic {

    public void printNumberInfo(int number) {
        if (number < 5000) {
            System.out.println("Liczba jest mniejsza od 5000");
        } else if (number == 5000) {
            System.out.println("Liczba jest rowna 5000");
        } else {
            System.out.println("Liczba jest wieksza od 5000");
        }


    }

    private void checkParity(int number) {
        if (number % 2 == 0) {
            System.out.println("Liczba jest parzysta");
        } else {
            System.out.println("Liczba jest nieparzysta");
        }
    }

    public int changeNumber(int number) {

        if (number / 1000 != 0) {
            return number;
        } else if (number / 100 != 0) {
            return number * 10;
        } else if (number / 10 != 0) {
            return number * 100;
        } else {
            return 0;
        }


        }
    }
