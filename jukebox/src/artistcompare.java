import java.util.Comparator;

public class artistcompare implements Comparator <songv1>{

    @Override
    public int compare(songv1 o1, songv1 o2) {
        return (o1.getArtist().compareTo(o2.getArtist()));
    }
}
