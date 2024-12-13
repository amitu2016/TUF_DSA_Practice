package sebi.previous.y2024;

import java.util.*;

public class PolynomialAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first polynomial
        System.out.print("Enter the number of terms in the first polynomial: ");
        int n1 = sc.nextInt();
        Map<Integer, Integer> poly1 = new HashMap<>();
        System.out.println("Enter the coefficients and powers for the first polynomial:");
        for (int i = 0; i < n1; i++) {
            int coeff = sc.nextInt();
            int power = sc.nextInt();
            poly1.put(power, poly1.getOrDefault(power, 0) + coeff);
        }

        // Input for second polynomial
        System.out.print("Enter the number of terms in the second polynomial: ");
        int n2 = sc.nextInt();
        Map<Integer, Integer> poly2 = new HashMap<>();
        System.out.println("Enter the coefficients and powers for the second polynomial:");
        for (int i = 0; i < n2; i++) {
            int coeff = sc.nextInt();
            int power = sc.nextInt();
            poly2.put(power, poly2.getOrDefault(power, 0) + coeff);
        }

        // Combine the two polynomials
        for (Map.Entry<Integer, Integer> entry : poly2.entrySet()) {
            poly1.put(entry.getKey(), poly1.getOrDefault(entry.getKey(), 0) + entry.getValue());
        }

        // Sort and print the resulting polynomial
        System.out.println("The resulting polynomial is:");
        poly1.entrySet().stream()
            .sorted((a, b) -> b.getKey() - a.getKey()) // Sort by power in descending order
            .forEach(entry -> {
                if (entry.getValue() != 0) {
                    System.out.print(entry.getValue() + "x^" + entry.getKey() + " ");
                }
            });

        sc.close();
    }
}


/*
 Explanation:
Input Polynomials:
The program reads the number of terms in each polynomial.
Each term is represented as a pair of coefficient and power.
Coefficients of the same power are summed up in a HashMap.

Combine Polynomials:
The coefficients of terms with the same power are added together.
The second polynomial terms are merged into the first polynomial's map.

Sorting and Printing:
The resulting polynomial is sorted by power in descending order.
Terms with a non-zero coefficient are displayed in the format coeff x^power. 
 * */
