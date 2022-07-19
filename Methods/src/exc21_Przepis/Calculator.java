package exc21_Przepis;

public class Calculator {

    public final static int GLASS = 250;
    public final static int CUP = 250;
    public final static int SPOON = 15;
    public final static int TEA_SPOON = 5;

    public static double glassToMl (int glass){
        return GLASS * glass;
    }


    public static double spoonToMl (int spoon){
        return SPOON * spoon;
    }


    public static double teaSpoonToMl (int teaSpoon){
        return TEA_SPOON * teaSpoon;
    }
}
