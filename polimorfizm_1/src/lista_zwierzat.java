public class lista_zwierzat {;
    private zwierze[] lista = new zwierze[5];
    private int nr_tablicy=0;

    void dodaj (zwierze z){
        lista[nr_tablicy]= z;
        System.out.println("dodanano zwierze na pozycji" + nr_tablicy);
        nr_tablicy++;
    }


}
