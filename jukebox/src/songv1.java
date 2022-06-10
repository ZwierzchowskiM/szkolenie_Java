public class songv1 implements Comparable<songv1> {
    private String title;
    private String artist;
    private int bpm;

    songv1 (String title, String artist, int bmp){
        this.title=title;
        this.artist=artist;
        this.bpm=bpm;
    }

    public String getTitle(){
        return title;
    }

    public String getArtist(){
        return artist;
    }

    public int getBpm(){
        return bpm;
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public int compareTo(songv1 s) {
        return title.compareTo(s.getTitle());
    }
}
