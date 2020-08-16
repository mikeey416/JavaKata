package lesson04b.methodoverloading;

public class StaticMethodOverloadingMainClass {

    public static void main(String[] args) {

        printValue("10");
        printValue(10.0);
        printValue(10);

    }

    public static void printValue(String value) {
        System.out.println("String Value: " + value);
    }

    public static void printValue(double value) {
        System.out.println("double Value: " + value);
    }

    public static void printValue(int value) {
        System.out.println("int Value: " + value);
    }

}
