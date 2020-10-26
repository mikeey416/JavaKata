package lesson09b;

public class Loop03RandomNumber {
    public static void main(String[] args) {
        int stopNumber = 9;

        int randomNumber =(int)(Math.random() * 10) + 1;

        while (stopNumber != randomNumber) {
            System.out.println("Random Number = " + randomNumber);
            randomNumber =(int)(Math.random() * 10) + 1;
        }
    }
}
