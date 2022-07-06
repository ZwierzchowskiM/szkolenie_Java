package exc4;

public class Home {
    double amountWater;
    double amountOil;

    Home (double water, double oil) {
        amountWater = water;
        amountOil = oil;
    }

    void takeShower() {
        System.out.println("Bierzemy prysznic");
        amountWater -= 48;
        printInfo();
    }

    void takeBath() {
        System.out.println("Bierzemy kąpiel");
        amountWater -= 86;
        printInfo();

    }

    void makeDinner() {
        amountWater -= 4;
        amountOil -= 0.1;
    }

    void boilWater() {
        amountWater -= 0.5;
        amountOil -= 0.05;

    }

    void watchTv (int numberHours) {
        System.out.println("Oglądamy TV");
        amountOil -= 1*numberHours;
        printInfo();
    }

    String printInfo (){
        String description = "Ilość wody: " + amountWater + ", " + "Ilość ropy: " + amountOil ;
        return  description;
    }

    public void makeLunch(String jajka) {
        System.out.println();
    }
}
