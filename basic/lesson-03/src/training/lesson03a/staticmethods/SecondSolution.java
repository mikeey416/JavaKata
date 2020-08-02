package training.lesson03a.staticmethods;

public class SecondSolution {
    public static void main(String[] args) {
        displayJanAddress();

        String russelLoadingStationAddress = displayRusselAddress();
        System.out.println(russelLoadingStationAddress);

        System.out.println("Second StaticMethod Java application");
    }

    public static void displayJanAddress() {
        System.out.println("Jan Medina Bagoongan");
        System.out.println("Poblacion");
        System.out.println("Floridablanca Pampanga");
    }

    public static String displayRusselAddress() {
        return "Russel Loading Station"
                + "\nTalang"
                + "\nFloridablanca Pampanga";
    }
}
