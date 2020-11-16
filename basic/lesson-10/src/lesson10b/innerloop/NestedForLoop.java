package lesson10b.innerloop;

public class NestedForLoop {
    public static void main(String[] args) {
        for (int count = 1; count < 3; count++) {
            for (int times = 1; times < 10; times++) {
                System.out.print(count + "x" + times + "=" + (count * times) + "  ");
            }
            System.out.print("\n");
        }
    }
}
