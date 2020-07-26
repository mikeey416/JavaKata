package data.sample04.booleanexercise;

import java.util.Scanner;

public class JudgementalSaKulay {

    final static char MAPUTI = 'w';
    final static char MORENO = 'y';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the color of your skin? w = White, y = Yellow, b = Brown : ");
        char color = scanner.nextLine().charAt(0);

        //TODO FIX OUTPUT, use boolean expression
        System.out.println("\nMaputi ba? ");

        //TODO FIX OUTPUT, use boolean expression
        System.out.println("Moreno ba? ");

        //TODO FIX OUTPUT, use boolean expression
        System.out.println("Maitim ba? ");
    }


    /**
     * Expectations
     * 1. Kapag 'w'
     * What is the color of your skin? w = White, y = Yellow, b = Brown : w
     *
     * Maputi ba? true
     * Moreno ba? false
     * Maitim ba? false
     *
     *
     * 2. Kapag 'y'
     * What is the color of your skin? w = White, y = Yellow, b = Brown : w
     *
     * Maputi ba? false
     * Moreno ba? true
     * Maitim ba? false
     *
     *
     * 3. Kapag 'b' or iba pa
     * What is the color of your skin? w = White, y = Yellow, b = Brown : w
     *
     * Maputi ba? false
     * Moreno ba? false
     * Maitim ba? true
     */
}
