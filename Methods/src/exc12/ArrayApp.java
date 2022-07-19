package exc12;

public class ArrayApp {
    public static void main(String[] args) {
        int[] tab1 = new int[3];
        int[] tab2 = {100,200,300};

        tab1[0]=10;
        tab1[1]=20;
        tab1[2]=30;

        System.out.println(tab1[0] + ", " +tab1[1] + ", " + tab1[2]);
        System.out.println(tab2[0] + ", " +tab2[1] + ", " + tab2[2]);

        int sum = tab1[0] + tab1[1] + tab1[2] + tab2[0] + tab2[1] + tab2[2];
        System.out.println(sum);
        ArrayLogic arrayLogic = new ArrayLogic();
        int sum2 = arrayLogic.sumTab(tab1, tab2);
        System.out.println(sum2);


    }



}
