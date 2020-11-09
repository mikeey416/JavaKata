package lesson09a;

public class ForLoop03DayByName {

    public static void main(String[] args) {
        String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday","Friday", "Saturday"};

        for (int dayOfWeek = 0; dayOfWeek < DAYS.length; dayOfWeek++ ) {
            if (!DAYS[dayOfWeek].equals("Sunday") && !DAYS[dayOfWeek].equals("Saturday")) {
                System.out.println(DAYS[dayOfWeek]);
            }
        }

    }
}
