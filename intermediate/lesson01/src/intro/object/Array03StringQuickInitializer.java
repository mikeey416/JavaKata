package intro.object;

public class Array03StringQuickInitializer {
    public static void main(String[] args) {
        String[] congregations = new String[]{"North", "South"};

        for (int i = 0; i < congregations.length; i++) {
            System.out.println("Congregations[" + i + "] = " + congregations[i]);
        }
    }
}
