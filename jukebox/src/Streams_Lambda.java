import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams_Lambda {
    public static void main(String[] args) {
        /* test
        List<String> allcollors =  new ArrayList<String>();
        allcollors.add("zielony");
        allcollors.add("Niebieski");
        allcollors.add("pomaranczowy");
        allcollors.forEach(System.out::println);

        List<String> newstream = allcollors.stream().sorted((s1,s2) ->s1.compareToIgnoreCase(s2)).limit(2).collect(Collectors.toList());
        System.out.println(newstream);
        */

        List<songv1> songs = MockSongs.getsongs();
        System.out.println(songs);

        List<songv1> rockSongs = songs.stream().filter(s1 -> s1.getYear()<2000).collect(Collectors.toList());
        System.out.println(rockSongs);

        List<String> genres = songs.stream().map(songv1 -> songv1.getgenre()).distinct().collect(Collectors.toList());
        System.out.println(genres);
    }



}
