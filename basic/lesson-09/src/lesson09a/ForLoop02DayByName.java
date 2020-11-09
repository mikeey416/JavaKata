package lesson09a;

public class ForLoop02DayByName {

    public static void main(String[] args) {
        String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday","Friday", "Saturday"};

        for (int dayOfWeek = 0; dayOfWeek < DAYS.length; dayOfWeek++ ) {
            System.out.println(DAYS[dayOfWeek]);
        }

    }
}
