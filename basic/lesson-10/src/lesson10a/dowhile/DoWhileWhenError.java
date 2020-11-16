package lesson10a.dowhile;

public class DoWhileWhenError {

    public static void main(String[] args) {
        String[] DAYS = {};
        int dayOfWeek = 0;

        do {
            System.out.println(DAYS[dayOfWeek]);
            dayOfWeek++;
        } while(dayOfWeek < DAYS.length);

    }
}
