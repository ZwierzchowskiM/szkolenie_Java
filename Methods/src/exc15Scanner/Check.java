package exc15Scanner;

public class Check {

    public static boolean checkInput(String toDo) {
        return toDo.equals("+") || toDo.equals("-") ||toDo.equals("*") ||toDo.equals("/");
    }
}
