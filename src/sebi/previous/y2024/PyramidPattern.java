package sebi.previous.y2024;

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the height of the pyramid
        System.out.print("Enter the height of the pyramid: ");
        int height = sc.nextInt();

        // Generate the pyramid
        for (int i = 1; i <= height; i++) {
            // Print spaces
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }

        sc.close();
    }
}

