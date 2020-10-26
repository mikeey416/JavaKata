package lesson08a;

public class Loop02DayByName {

    public static void main(String[] args) {
        String[] DAYS = {"Monday", "Tuesday", "Wednesday", "Thursday","Friday"};
        int dayOfWeek = 0;

        while (dayOfWeek < DAYS.length) {
            System.out.println(DAYS[dayOfWeek]);
            dayOfWeek++;
        }

    }
}
