package exc13Winda;

public class Winda {

    private Person[] people = new Person[4];
    private int numberOfPerson =0;
    private final int maxWeight = 400;

    public Person[] getPeople() {
        return people;
    }

    void addPerson (Person person){

        if (numberOfPerson<4) {
            people[numberOfPerson] = person;
            numberOfPerson++;
            System.out.println("dodana nowa osoba");
        } else {
            System.out.println("Brak miejsca w windzie");
        }

    }

    void windaStart () {
        if (checkWeightOk()) {
            System.out.println("Winda start");
        } else System.out.println("winda przeciazona o " + checkOverLoad(getTotalweight()) + "kg");
    }

    boolean checkWeightOk() {
        return getTotalweight() <= maxWeight;
    }

    private int getTotalweight() {
        int totalWeight = 0;
        if (people[0] != null) totalWeight+=people[0].getPersonWeight();
        if (people[1] != null) totalWeight+=people[1].getPersonWeight();
        if (people[2] != null) totalWeight+=people[2].getPersonWeight();
        if (people[3] != null) totalWeight+=people[3].getPersonWeight();

        return totalWeight;
    }

    private int checkOverLoad(int sumWeight) {
        return sumWeight - maxWeight;
    }

    public void clearPeople() {
        people = null;
        numberOfPerson=0;
        System.out.println("winda oprozniona");
    }


}
