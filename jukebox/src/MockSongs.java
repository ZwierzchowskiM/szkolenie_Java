import java.util.ArrayList;
import java.util.List;

public class MockSongs {
    public static List<songv1> getsongs(){
        List songs = new ArrayList<>();
        songv1 pierwsza = new songv1(" atwor1", "artist1", 120, 1923,11, "jazz");
        songv1 druga = new songv1(" gtwor22", "grtist22", 122,202,211,"rock");
        songv1 trzy = new songv1(" vtwor3", "drtist33", 88,345,453,"rock");
        songv1 czwarta = new songv1(" btwor4", "qrtist44", 425,245,22222,"disco");
        songv1 piata = new songv1(" ctwor5", "ctist54", 325,1923,9585,"disco");
        songv1 szosta = new songv1(" ttor6", "ttist64", 525,1865,2,"rockowe");
        songv1 siodma = new songv1(" zzor7", "zrtist774", 25,3334,44,"disco");
        songs.add(pierwsza);
        songs.add(druga);
        songs.add(trzy);
        songs.add(czwarta);
        songs.add(piata);
        songs.add(szosta);
        songs.add(siodma);

        return songs;
    }
}
