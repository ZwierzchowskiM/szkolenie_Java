package exc25_Courses;

public class CourseBootcamp extends CourseOnline{
    private String firstName;
    private String lastName;
    private int consultationTime;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getConsultationTime() {
        return consultationTime;
    }

    public void setConsultationTime(int consultationTime) {
        this.consultationTime = consultationTime;
    }
}
