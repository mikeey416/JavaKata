package lesson10a.dowhile;

public class DoWhileByFixedNumber {
    public static void main(String[] args) {
        int dayOfWeek = 1;

        do {
            System.out.println("Day " + dayOfWeek);
            dayOfWeek++;
        } while(dayOfWeek > 7);

    }
}
