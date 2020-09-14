package lesson06c;

/**
 * Lesson-06 c1. Nested if inside if
 */
public class Lesson6c1_Nested_If_Main {
    public static void main(String[] args) {
        String day = "Monday";
        boolean hindiVisitNgCO = false;

        if (day.equals("Monday")) {
            if (hindiVisitNgCO) {
                System.out.println("Gising ng 8:00 AM");
                System.out.println("Unat-unat konti");
                System.out.println("8:30 AM, iOpen na Zoom.");
                System.out.println("Java Training!");
            }
        }

    }
}
