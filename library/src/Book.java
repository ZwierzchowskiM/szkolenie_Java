public class Book {
    String tytul;
    String autor;
    int rokWydania;
    int iloscStron;
    String wydawnictwo;
    String numerISBN;

    public Book(String tytul, String autor, int rokWydania, int iloscStron, String wydawnictwo, String numerISBN) {
        this(tytul, autor, rokWydania, iloscStron, wydawnictwo);
        this.numerISBN = numerISBN;
    }


    public Book(String tytul, String autor, int rokWydania, int iloscStron, String wydawnictwo) {
        this.tytul = tytul;
        this.autor = autor;
        this.rokWydania = rokWydania;
        this.iloscStron = iloscStron;
        this.wydawnictwo = wydawnictwo;
    }



    void printInfo() {
        String info = tytul + ";" + autor + ";" + rokWydania + ";" + iloscStron + ";" + wydawnictwo +";" + numerISBN;
        System.out.println(info);
    }
}
