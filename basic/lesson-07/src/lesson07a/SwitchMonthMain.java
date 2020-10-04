package lesson07a;

public class SwitchMonthMain {
    public static void main(String[] args) {

        String month = "April";

        switch(month) {
            case "March":
                System.out.println("CO Visit");
                break;
            case "April":
                System.out.println("Memorial");
                break;
            case "May":
                System.out.println("Circuit Assembly");
                break;
            case "August":
                System.out.println("Regional Assembly");
                break;
            case "September":
                System.out.println("CO Visit");
                break;
            case "November":
                System.out.println("Circuit Assembly");
                break;
            default:
                System.out.println("As usual...");
        }

    }
}
