package model;

public class Publication {
    private String tytul;
    private String publisher;
    private int rokWydania;

    public Publication(String tytul, String publisher, int rokWydania) {
        this.tytul = tytul;
        this.publisher = publisher;
        this.rokWydania = rokWydania;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }
}
