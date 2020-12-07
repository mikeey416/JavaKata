package intro.object;

public class Array01ObjectArray {
    public static void main(String[] args) {
        String[] congregations = new String[2];
        congregations[0] = "North Floridablanca";
        congregations[1] = "South Floridablanca";

        for (int i = 0; i < congregations.length; i++) {
            System.out.println("Congregations[" + i + "] = " + congregations[i]);
        }
    }
}
