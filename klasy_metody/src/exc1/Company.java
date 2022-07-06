package exc1;

public class Company {
    public static void main(String[] args) {
        Empoyee pracownik1 = new Empoyee();
        Empoyee pracownik2 = new Empoyee();
        Empoyee pracownik3 = new Empoyee();

        pracownik1.imie = "Stefan";
        pracownik1.nazwisko = "Zieliński";
        pracownik1.rokUrodzenia = 1990;
        pracownik1.stazPracy = 1;

        pracownik2.imie = "Adam";
        pracownik2.nazwisko = "Nowak";
        pracownik2.rokUrodzenia = 1945;
        pracownik2.stazPracy = 2;

        pracownik3.imie = "łukasz";
        pracownik3.nazwisko = "Kowalski";
        pracownik3.rokUrodzenia = 1978;
        pracownik3.stazPracy = 4;

        System.out.println("Pierwszy pracownik to:");
        System.out.println(pracownik1.imie + " " + pracownik1.nazwisko + " Rok urodzenia: " + pracownik1.rokUrodzenia + " Staż pracy: " + pracownik1.stazPracy);
        System.out.println("Drugi pracownik to:");
        System.out.println(pracownik2.imie + " " + pracownik2.nazwisko + " Rok urodzenia: " + pracownik2.rokUrodzenia + " Staż pracy: " + pracownik2.stazPracy);
        System.out.println("Trzeci pracownik to:");
        System.out.println(pracownik3.imie + " " + pracownik3.nazwisko + " Rok urodzenia: " + pracownik3.rokUrodzenia + " Staż pracy: " + pracownik3.stazPracy);


    }
}
