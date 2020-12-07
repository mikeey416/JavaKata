package intro.object;

public class Array02ObjectNullValues {
    public static void main(String[] args) {
        String[] congregations = new String[2];
        congregations[0] = "North Floridablanca";

        for (int i = 0; i < congregations.length; i++) {
            System.out.println("Congregations[" + i + "] = " + congregations[i]);
        }
    }
}
