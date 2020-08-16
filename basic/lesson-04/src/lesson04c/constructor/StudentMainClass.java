package lesson04c.constructor;

public class StudentMainClass {
    public static void main(String[] args) {
        printStudent(new Student("Russel"));
        printStudent(new Student("James"));
        printStudent(new Student("Jan"));
        printStudent(new Student("Julex"));
    }

    public static void printStudent(Student student) {
        System.out.println("Student: " + student);
    }
}
