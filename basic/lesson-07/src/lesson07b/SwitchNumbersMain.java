package lesson07b;

public class SwitchNumbersMain {
    public static void main(String[] args) {

        int year = 2020;

        switch(year) {
            case 1970:
            case 1980:
            case 1990:
                System.out.println("Generation X");
                break;
            case 2000:
            case 2010:
            case 2020:
                System.out.println("Millennial's");
                break;
            default:
                System.out.println("Oldies...");
        }

    }
}
