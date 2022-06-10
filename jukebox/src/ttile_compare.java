import java.util.Comparator;

public class ttile_compare implements Comparator <songv1> {
    @Override
    public int compare(songv1 o1, songv1 o2) {
        return (o1.getTitle().compareTo(o2.getTitle()));
    }
}
