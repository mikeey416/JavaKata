package lesson06a;

/**
 * Lesson-06 a. Making Decisions using if
 */
public class Lesson6a1_If_Main {
    public static void main(String[] args) {
        //Using literal boolean value
        if (true)
            System.out.println("if (true) println is called");

        //using boolean variable
        boolean isValueTrue = true;
        if (isValueTrue)
            System.out.println("if (isValueTrue) println is called");

        //RELATIONAL OPERATORS
        //using relational operator == (is equals)
        int year = 2020;
        if (year == 2020)
            System.out.println("if (year == 2020) println is called");

        //using relational operator < (less than)
        if (year < 2021)
            System.out.println("if (year < 2021) println is called");

        //using relational operator > (greater than)
        if (year > 2021)
            System.out.println("if (year > 2021) println is called");
    }
}
