package lesson09b;

public class EnhancedForLoop02DayByName {

    public static void main(String[] args) {
        String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday","Friday", "Saturday"};

        for (String day : DAYS) {
            if (!day.equals("Sunday") && !day.equals("Saturday")) {
                System.out.println(day);
            }
        }

    }
}
