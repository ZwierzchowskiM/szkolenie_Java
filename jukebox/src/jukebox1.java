import java.util.Collections;
import java.util.List;

public class jukebox1 {

    public void go(){
        List<songv1> songList = MockSongs.getsongs();
        System.out.println(songList);

        artistcompare artist_comp = new artistcompare();
        songList.sort(artist_comp);
        System.out.println(songList);

        ttile_compare title_comp = new ttile_compare();
        songList.sort(title_comp);
        System.out.println(songList);
    }
}
