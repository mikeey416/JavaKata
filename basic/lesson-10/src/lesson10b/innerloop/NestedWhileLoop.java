package lesson10b.innerloop;

public class NestedWhileLoop {
    public static void main(String[] args) {
        int row = 1;
        while (row < 6) {
            int column = 0;
            System.out.print("Row" + row + "|  ");
            while (column < 3) {
                System.out.print("C" + column + "  ");
                column++;
            }
            row++;
            //NewLine
            System.out.print("\n");
        }
    }
}
