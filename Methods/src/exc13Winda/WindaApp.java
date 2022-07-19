package exc13Winda;

public class WindaApp {
    public static void main(String[] args) {
        Person person1 = new Person(1, 100);
        Person person2 = new Person(2, 90);
        Person person3 = new Person(3, 130);
        Person person4 = new Person(4, 100);
        Person person5 = new Person(5, 100);

        Winda winda = new Winda();

        winda.addPerson(person1);
        winda.addPerson(person2);
        winda.addPerson(person3);
//        winda.addPerson(person4);
        //winda.addPerson(person5);

        winda.windaStart();
        winda.clearPeople();




    }
}
