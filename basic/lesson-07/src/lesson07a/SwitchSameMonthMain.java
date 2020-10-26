package lesson07a;

public class SwitchSameMonthMain {
    public static void main(String[] args) {
        String month = "March";

        switch (month) {
            case "March":
            case "September":
                System.out.println("CO Visit");
                break;
            case "April":
                System.out.println("Memorial");
                break;
            case "May":
            case "November":
                System.out.println("Circuit Assembly");
                break;
            case "August":
                System.out.println("Regional Assembly");
                break;
            default:
                System.out.println("As usual...");
        }

    }

}
