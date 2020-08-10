public class Exercise7 {

    public static void main(String args[]) {
        // define the range
        int min = 1;
        int max = 100;

        // generate random numbers within 1 to 100
        int random = (int)(Math.random() * max) + min;

        // Output is different everytime this code is executed
        System.out.println(random);
    }
}
