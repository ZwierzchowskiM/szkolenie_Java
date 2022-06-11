public class songv1 implements Comparable<songv1> {
    private String title;
    private String artist;
    private int bpm;
    private int year;
    private int timesplayed;
    private String genre;

    songv1 (String title, String artist, int bmp, int year, int timesplayed, String genre){
        this.title=title;
        this.artist=artist;
        this.bpm=bpm;
        this.year=year;
        this.timesplayed=timesplayed;
        this.genre=genre;
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

    public int getYear(){
        return year;
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
