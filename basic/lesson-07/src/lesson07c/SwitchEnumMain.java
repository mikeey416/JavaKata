package lesson07c;

public class SwitchEnumMain {
    public static void main(String[] args) {

        Day day = Day.MONDAY;

        switch(day) {
            case MONDAY:
                System.out.println("Java Training Day.");
                break;
            case WEDNESDAY:
                System.out.println("Midweek Meeting.");
                break;
            case THURSDAY:
            case SATURDAY:
                System.out.println("Letter Writing.");
                break;
            default:
                System.out.println("Normal Day...");
        }

    }
}
