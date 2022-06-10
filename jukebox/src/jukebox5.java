import java.util.*;

public class jukebox5 {
    public static void main(String[] args) {
        new jukebox5().go();
    }

    public void go(){
        List<songv1> songList = MockSongs.getsongs();
        System.out.println(songList);

        songList.sort((one, two) -> two.getTitle().compareTo(one.getTitle()))  ;
        System.out.println(songList);

        Set<songv1> tree = new TreeSet<>((one, two) -> one.getTitle().compareTo(two.getTitle()));
        tree.add(songList.get(0));
        tree.add(songList.get(1));
        tree.add(songList.get(2));
        tree.add(songList.get(3));
        System.out.println(tree);



    }
}
