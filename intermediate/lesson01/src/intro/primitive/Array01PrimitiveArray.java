package intro.primitive;

public class Array01PrimitiveArray {
    public static void main(String[] args) {
        int[] attendances = new int[4];
        attendances[0] = 10;
        attendances[1] = 20;
        attendances[2] = 30;
        attendances[3] = 40;

        System.out.println("Length=" + attendances.length);
        for (int i = 0; i < attendances.length; i++) {
            System.out.println("Attendance[" + i + "] = " + attendances[i]);
        }
    }
}
