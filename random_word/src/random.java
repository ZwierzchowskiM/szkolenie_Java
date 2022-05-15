public class random {
    public static void main(String[] args) {
        String [] lista_slow = {"architektura wielowarstwowa", "3000 metrów", "jam session", "wakacje"};
        String [] lista_slow2 = {"zwieksza możliwości", "poprawia atrakyjnosc"};

        int lista1_dlugosc= lista_slow.length;
        int lista2_dlugosc= lista_slow2.length;

        int rnd1=(int) (Math.random()*lista1_dlugosc);
        int rnd2=(int) (Math.random()*lista2_dlugosc);

        String zdanie = lista_slow[rnd1] + " " + lista_slow2[rnd2];
        System.out.println(zdanie);
    }


}
