import java.util.ArrayList;
import java.util.List;

public class MockSongs {
    public static List<songv1> getsongs(){
        List songs = new ArrayList<>();
        songv1 pierwsza = new songv1(" atwor1", "artist1", 120);
        songv1 druga = new songv1(" gtwor22", "grtist22", 122);
        songv1 trzy = new songv1(" vtwor3", "drtist33", 88);
        songv1 czwarta = new songv1(" btwor4", "qrtist44", 125);
        songs.add(pierwsza);
        songs.add(druga);
        songs.add(trzy);
        songs.add(czwarta);

        return songs;
    }
}
