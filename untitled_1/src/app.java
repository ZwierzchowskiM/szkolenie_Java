public class app {
    public static void main(String[] args) {
        int ilosc_butelek = 100;
        //System.out.println(a);
        while (ilosc_butelek > 0) {
            if (ilosc_butelek>1) {
                System.out.println("w sklepie jest " + ilosc_butelek + "butelek");
            }
                else {
                System.out.println("w sklepie jest " + ilosc_butelek + "butelka ");
            }

            ilosc_butelek--;

        }
        if (ilosc_butelek==0)
        {
            System.out.println("w sklepie nie ma butelek");
        }
    }
}