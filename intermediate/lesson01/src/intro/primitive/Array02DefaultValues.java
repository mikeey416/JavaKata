package intro.primitive;

public class Array02DefaultValues {
    public static void main(String[] args) {
        int[] attendances = new int[4];
        attendances[0] = 15;

        for (int i = 0; i < attendances.length; i++) {
            System.out.println("Attendance[" + i + "] = " + attendances[i]);
        }
    }
}
