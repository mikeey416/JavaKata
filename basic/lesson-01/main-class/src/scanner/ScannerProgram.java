/*
 * This example demonstrates the usage of:
 * 1. package
 * 2. import
 * 3.
 */
package scanner;

import java.util.Scanner;

public class ScannerProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println("Scanner got input of : " + input);
    }

}