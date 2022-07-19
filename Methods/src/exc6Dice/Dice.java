package exc6Dice;

import java.util.Random;

public class Dice {
    int dotsNumber;
    Random random = new Random();
    Dice() {
        roll();
    }

    Dice(int dotsNumber) {
        this.dotsNumber = dotsNumber;
    }

    void roll (){

        dotsNumber = random.nextInt(7-1) + 1;
    }

    void printInfo(){
        System.out.println("Liczba oczek na kostce: " + dotsNumber);
    }
}
