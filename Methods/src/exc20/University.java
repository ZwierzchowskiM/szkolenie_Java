package exc20;

public class University {
    public static void main(String[] args) {
        Student student1 = new Student("Lukasz", "Nowak", 112233);
        Student student2 = new Student("Marcin", "Musial", 122363);

        System.out.println(Student.numberOfStudents);
    }
}
