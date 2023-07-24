package com.toyota.util;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("Enter data (type 'quit' to exit): ");
            input = scanner.nextLine();

            if ("quit".equalsIgnoreCase(input)) {
                System.out.println("Exiting program...");
                break;
            } else {
                System.out.println("You entered: " + input);
            }
        }

        scanner.close();
    }
}
