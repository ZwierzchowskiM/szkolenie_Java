package exc20;

public class Student {
    private String firstName;
    private String lastName;
    private int nrIndeksu;
    static int numberOfStudents = 0 ;


    public Student(String firstName, String lastName, int nrIndeksu) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nrIndeksu = nrIndeksu;
        numberOfStudents++;
    }
}
