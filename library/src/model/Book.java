package model;

public class Book extends Publication{

    private int iloscStron;
    private String author;
    private String numerISBN;

    public Book(String tytul, String autor, int rokWydania, int iloscStron, String wydawnictwo, String numerISBN) {
        super(tytul,wydawnictwo,rokWydania);
        this.iloscStron = iloscStron;
        this.author = autor;
        this.numerISBN = numerISBN;
    }


    public int getIloscStron() {
        return iloscStron;
    }

    public void setIloscStron(int iloscStron) {
        this.iloscStron = iloscStron;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getNumerISBN() {
        return numerISBN;
    }

    public void setNumerISBN(String numerISBN) {
        this.numerISBN = numerISBN;
    }

    public void printInfo() {
        testInfo();
    }

    private void testInfo() {
        String info = getTytul() + "; " + author + "; " + getRokWydania() + "; " + iloscStron + "; " + getPublisher();

        if (numerISBN != null){
            info = info + "; " + numerISBN;
        }

        System.out.println(info);
    }



}
