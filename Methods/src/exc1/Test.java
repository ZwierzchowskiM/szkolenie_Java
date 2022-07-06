package exc1;

public class Test {
    public static void main(String[] args) {
        double x = 3;
        double y = 5;

        Calc calc = new Calc();
        calc.a = 100;
        calc.c = 200;

        System.out.println( "Dodawanie: " + calc.add(x,y));
        System.out.println( "Odejmowanie: " + calc.subtract(x,y));
        System.out.println( "Mnożenie: " + calc.mul(x,y));
        System.out.println( "Dzielenie: " + calc.div(x,y));

        System.out.println(calc.c);
    }

}
