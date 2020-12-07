package intro.primitive;

public class Array04QuickInitializer {
    public static void main(String[] args) {
        int[] attendances = new int[]{10, 20, 30, 40};

        for (int i = 0; i < attendances.length; i++) {
            System.out.println("Attendance[" + i + "] = " + attendances[i]);
        }
    }
}
