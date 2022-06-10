import java.util.ArrayList;
import java.util.Scanner;

public class portal_v2 {
    Scanner sc = new Scanner(System.in);
    private ArrayList<Integer> polaPolozenie = new ArrayList<Integer>();
    private String nazwa_portalu;


    public void setNazwa_portalu (String nowa_nazwa) {
        nazwa_portalu = nowa_nazwa;
    }

    public String getNazwa_portalu () {
        return nazwa_portalu;
    }


    public void okreslPozycje (){
        System.out.println("podaj położenie portalu");
        int pozycja = sc.nextInt();
        polaPolozenie.add(pozycja);
        polaPolozenie.add(pozycja+1);
        polaPolozenie.add(pozycja+2);
    }

    public String sprawdz (int strzal){
        String wynik = "pudło";
        int indeks = polaPolozenie.indexOf(strzal);

        if (indeks>=0){
            polaPolozenie.remove(indeks);
            wynik = "trafiony";

        }

        if (polaPolozenie.isEmpty())
        {
            wynik = "zatopiony";
        }

        System.out.println(wynik);
        return wynik;
    }
}
