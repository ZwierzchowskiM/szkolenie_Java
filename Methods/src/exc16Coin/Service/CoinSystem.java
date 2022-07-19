package exc16Coin.Service;

import java.util.Random;
import java.util.Scanner;

public class CoinSystem {
    private int coinSide;
    private int userChoice;
    private String userChoiceWord;
    private int systemResult;
    private String systemResultWord;
    final int orzel = 1;
    final int reszka = 0;

   Random random = new Random();
    Scanner scanner = new Scanner(System.in);

   public void bet() {
       printInfo();
       userChoice = scanner.nextInt();
       userChoiceWord =  resultAsWord(userChoice);
   }

   void printInfo() {
       System.out.println("Wybierz jedna z opcji: ");
       System.out.println( orzel + " - Orzel");
       System.out.println(reszka + " - Reszka");

   }



   public void throwCoin (){
       systemResult =  random.nextInt(2);
       systemResultWord = resultAsWord(systemResult);
   }

   public void checkResult () {
       System.out.println("Wylosowana strona to: " + systemResultWord);
       System.out.println("Twoj wybor to: " + userChoiceWord);
       if (userChoice == systemResult) {
               System.out.println("Brawo wypadl: " + systemResultWord + " wygrywasz");
           } else {
               System.out.println("Niestety, wypadl: " + systemResultWord + " przegrywasz");
           }

       }
       ;


     public String resultAsWord (int resultSystem){
        return switch (resultSystem) {
            case 1 -> "Orzel";
            case 0 -> "Reszka";
            default -> "Blad";
    };

    };
}

