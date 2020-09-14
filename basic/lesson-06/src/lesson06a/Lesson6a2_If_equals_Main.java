package lesson06a;

/**
 * Lesson-06 a. Making Decisions using if
 */
public class Lesson6a2_If_equals_Main {
    public static void main(String[] args) {
        //boolean using Object's equals
        String name = "Russel";

        if (name.equals("russel"))
           System.out.println("name is russel");

        if (name == "Russel")
            System.out.println("name == Russel is called!");

        if (name.equals("Russel"))
            System.out.println("name is Russel");
    }
}
