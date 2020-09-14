package lesson06d;

/**
 * Lesson-06 d2. Logical Operator
 */
public class Lesson6d2_LogicalOperator_IfElse_Main {
    public static void main(String[] args) {
        String day = "Monday";
        boolean coVisit = true;

        if (day.equals("Monday") && coVisit) {
            System.out.println("Gising ng 10:00 AM");
            System.out.println("Hayahay muna ngayon, busy na this week!");
        } else if (day.equals("Monday") && !coVisit) {
            System.out.println("8:30 AM, iOpen na Zoom.");
            System.out.println("Java Training!");
        } else if (day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday")  || day.equals("Friday")){
            System.out.println("Gising ng 8:00 AM");
            System.out.println("Letter Writing");
        }

    }
}
