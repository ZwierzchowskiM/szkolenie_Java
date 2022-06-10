import java.util. ArrayList;
public class portal_v1{

   private ArrayList<Integer> polaPolozenie;
    // int ilosctrafien;

    public void setpolaPolozenie (ArrayList<Integer> pozycja){
        polaPolozenie=pozycja;
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
