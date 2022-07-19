package exc13Winda;

public class Person {
    int personId;
    int personWeight;

    public Person(int personId, int personWeight) {
        this.personId = personId;
        this.personWeight = personWeight;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getPersonWeight() {
        return personWeight;
    }

    public void setPersonWeight(int personWeight) {
        this.personWeight = personWeight;
    }
}
