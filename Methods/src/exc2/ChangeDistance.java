package exc2;

public class ChangeDistance {

    double changeMetrToCentymetr (int centymetr){
        return (centymetr * 10);
    }

    double changeMetrToMilimetr (int metr){
        return (metr * 1000);
    }

    double changeCentymetrToMetr (int centymetr){
        return (centymetr / 100);
    }

    double changeMilimetrToMetr (int milimetr){
        return (milimetr / 1000);
    }
}
