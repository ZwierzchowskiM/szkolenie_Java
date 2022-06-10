import java.util.ArrayList;
import java.util.Scanner;
public class portal_gra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iloscruchow;
        int ilosctrafien=0;
        boolean czyistnieje=true;

        portal_v1 gra = new portal_v1();
        System.out.println("podaj lokalizacje portalu");
        int a= sc.nextInt();
        ArrayList<Integer> polozenie_portalu = new ArrayList<Integer>();
        polozenie_portalu.add(a);
        polozenie_portalu.add(a+1);
        polozenie_portalu.add(a+2);
        gra.setpolaPolozenie(polozenie_portalu);

        while (czyistnieje==true){
            System.out.println("podaj cel");
            int b=sc.nextInt();
            String wynik_gry = gra.sprawdz(b);
            if (wynik_gry.equals("zatopiony")){
                czyistnieje = false;
            }
        }
    }



}
