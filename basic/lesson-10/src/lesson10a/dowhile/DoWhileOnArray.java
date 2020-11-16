package lesson10a.dowhile;

public class DoWhileOnArray {

    public static void main(String[] args) {
        String[] DAYS = {"Monday", "Tuesday", "Wednesday", "Thursday","Friday"};
        int dayOfWeek = 0;

        do {
            System.out.println(DAYS[dayOfWeek]);
            dayOfWeek++;
        } while(dayOfWeek < DAYS.length);

    }
}
