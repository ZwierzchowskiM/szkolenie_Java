package exc2;

public class ChangeTime {
    double changeHourToMinute ( double hour) {
        return (hour * 60 );
    }

    double changeMinuteToSecond ( double minute) {
        return (minute * 60 );
    }

    double changeSecondToMilisecond ( double second) {
        return ( second * 1000);
    }

    double changeHourToMs (double hour) {
       double resultM = changeHourToMinute(hour);
       double resultS = changeMinuteToSecond(resultM);
       double resultMs = changeSecondToMilisecond(resultS);

       return resultMs;

    }

}
