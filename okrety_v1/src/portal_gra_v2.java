import java.util.ArrayList;
import java.util.Scanner;

public class portal_gra_v2 {

        Scanner sc = new Scanner(System.in);
        int iloscruchow=0;
        boolean czyistnieje=true;
        ArrayList<portal_v2> lista_portali = new ArrayList<portal_v2>();


         void przygotuj_gre(){
            portal_v2 portal1 = new portal_v2();
            portal_v2 portal2 = new portal_v2();

             System.out.println("podaj nazwe pierwszego portalu");
            String nazwa_portal_1 = sc.nextLine();
             System.out.println("podaj nazwe drugiego portalu");
            String nazwa_portal_2 = sc.nextLine();


            portal1.setNazwa_portalu(nazwa_portal_1);
            portal2.setNazwa_portalu(nazwa_portal_2);

            lista_portali.add(portal1);
            lista_portali.add(portal2);

            for (portal_v2 temp : lista_portali){
            temp.okreslPozycje();
            }
        }


         void rozpocznij_gre() {
        while (!lista_portali.isEmpty()){
            System.out.println("podaj proponowane pole");
            int strzal = sc.nextInt();
            for (portal_v2 temp : lista_portali){
                String wynik = temp.sprawdz(strzal);
                if (wynik.equals("zatopiony")){
                    String nazwa_zatopiona = temp.getNazwa_portalu();
                    System.out.println("zatopiony portal o nazwie "+ nazwa_zatopiona);
                }
            }
         }
    }

}
