package lesson06c;

/**
 * Lesson-06 c2. Nested if-else inside if
 */
public class Lesson6c2_Nested_IfElse_Main {
    public static void main(String[] args) {
        String day = "Monday";
        boolean coVisit = true;

        if (day.equals("Monday")) {
            if (coVisit) {
                System.out.println("Gising ng 10:00 AM");
                System.out.println("Hayahay muna ngayon, busy na this week!");
            } else {
                System.out.println("Gising ng 8:00 AM");
                System.out.println("Unat-unat konti");
                System.out.println("8:30 AM, iOpen na Zoom.");
                System.out.println("Java Training!");
            }
        }

    }
}
