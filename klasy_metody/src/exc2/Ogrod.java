package exc2;

public class Ogrod {
    public static void main(String[] args) {

        Double dzienneZuyzcie;
        Double tygodnioweZuzycie;
        Double roczneZuzycie;

        Roslina kwiat1 = new Roslina();
        Roslina kwiat2 = new Roslina();
        Roslina kwiat3 = new Roslina();

        kwiat1.zapotrzbowanieWodaH = 1.0;
        kwiat1.zapotrzebowanieDzienne = 24* kwiat1.zapotrzbowanieWodaH;

        kwiat2.zapotrzbowanieWodaH = 1.0;
        kwiat2.zapotrzebowanieDzienne = 24* kwiat2.zapotrzbowanieWodaH;

        kwiat3.zapotrzbowanieWodaH = 1.0;
        kwiat3.zapotrzebowanieDzienne = 24* kwiat3.zapotrzbowanieWodaH;

        dzienneZuyzcie = kwiat1.zapotrzebowanieDzienne + kwiat2.zapotrzebowanieDzienne + kwiat3.zapotrzebowanieDzienne;
        tygodnioweZuzycie = dzienneZuyzcie*7;
        roczneZuzycie = dzienneZuyzcie*365;

        System.out.println("Dzienne zużycie kwiatów to: " + dzienneZuyzcie);
        System.out.println("Tygodniowe zużycie kwiatów to: " + tygodnioweZuzycie);
        System.out.println("Roczne zużycie kwiatów to: " + roczneZuzycie);

    }




}
