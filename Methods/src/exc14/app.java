package exc14;

public class app {
    public static void main(String[] args) {
        double[][] tab = new double[3][];
        double[] line1 = {1,1.5,2};
        double[] line2 = {1.5,2,2.5};
        double[] line3 = {2,2.5,3};

        tab[0] = line1;
        tab[1] = line2;
        tab[2] = line3;


        double sumCross1 = tab[0][0]*tab[1][1]*tab[2][2];
        double sumCross2 = tab[2][0]*tab[1][1]*tab[0][2];
        double sumCross = sumCross1 + sumCross2;
        System.out.println(sumCross);


    }
}
