package exc2;

public class ChangeMain {
    public static void main(String[] args) {
        int timeToChange = 14;
        ChangeTime changeTime = new ChangeTime();
        double resultM = changeTime.changeHourToMinute(timeToChange);
        double resultS = changeTime.changeMinuteToSecond(resultM);
        double resultMs = changeTime.changeSecondToMilisecond(resultS);
        double resultMs2 = changeTime.changeHourToMs(timeToChange);

        System.out.println(resultM);
        System.out.println(resultS);
        System.out.println(resultMs);

        System.out.println("Wynik 1: " + resultMs);
        System.out.println("Wynik 2: " + resultMs2);

    }
}
