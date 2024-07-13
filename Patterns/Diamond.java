// package Patterns;

public class Diamond {
    public static void main(String[] args) {
        int number = 3;
        int m, n;

        // Outer loop 1
        // prints the first half diamond
        // m<=3 m=3
        for (m = 1; m <= number; m++) {

            // Inner loop 1 print whitespaces inbetween
            // n<=0 n = 1
            for (n = 1; n <= number - m; n++) {
                System.out.print(" ");
            }

            // Inner loop 2 prints star
            // n <= 5 n = 1
            for (n = 1; n <= m * 2 - 1; n++) {
                System.out.print("*");
            }

            // Ending line after each row
            System.out.println();
        }

        // Outer loop 2
        // Prints the second half diamond
        // m 1 m > 0
        for (m = number - 1; m > 0; m--) {

            // Inner loop 1 print whitespaces inbetween
            // n = 1 n<=2
            for (n = 1; n <= number - m; n++) {
                System.out.print(" ");
            }

            // Inner loop 2 print star
            // n = 1 n<= 1
            for (n = 1; n <= m * 2 - 1; n++) {
                System.out.print("*");
            }

            // Ending line after each row
            System.out.println();
        }
    }
}
