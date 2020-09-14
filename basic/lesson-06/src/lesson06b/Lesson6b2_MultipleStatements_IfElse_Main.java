package lesson06b;

/**
 * Lesson-06 b2. Multiple statements inside if-else
 */
public class Lesson6b2_MultipleStatements_IfElse_Main {
    public static void main(String[] args) {
        String day = "Monday";

        if (day.equals("Monday")) {
            System.out.println("Gising ng 8:00 AM");
            System.out.println("Unat-unat konti");
            System.out.println("8:30 AM, iOpen na Zoom.");
            System.out.println("Java Training!");
        } else if (day.equals("Wednesday")) {
            System.out.println("5:00 PM, iOpen na Zoom.");
            System.out.println("Midweek Meeting!");
        } else if (day.equals("Sunday")) {
            System.out.println("8:30 AM, iOpen na Zoom.");
            System.out.println("Sunday Meeting!");
        }
    }
}
