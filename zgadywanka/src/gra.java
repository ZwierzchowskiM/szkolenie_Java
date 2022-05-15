public class gra {

    public void rozpocznij_gre(){
        gracz g1 = new gracz();
        gracz g2 = new gracz();



        int liczbaOdgadywana = (int) (Math.random()*10);
        System.out.println("Liczba odgadywana to: " + liczbaOdgadywana);

        boolean g1Odgadl = false;
        boolean g2Odgadl = false;

        int liczba_g1 = g1.zgaduj();
        int liczba_g2 = g2.zgaduj();

        if(liczba_g1==liczbaOdgadywana)  {
            System.out.println("G1 odgadł");
        }
        else{
            System.out.println("G1 pudło");

        }


        if (liczba_g2==liczbaOdgadywana) {
            System.out.println("G2 odgadł");
        }
        else{
            System.out.println("G2 pudło");

        }

    }





}
