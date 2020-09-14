package lesson06b;

/**
 * Lesson-06 b0. Pitfall when using Multiple statements inside if
 */
public class Lesson6b0_MultipleStatements_If_Main {
    public static void main(String[] args) {
        String day = "Monday";

        if (day.equals("Monday"))
            System.out.println("8:30 AM, iOpen na Zoom.");
            System.out.println("Java Training!");
    }
}
