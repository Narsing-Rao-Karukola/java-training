public class NumberTriangle2 {
    public static void main(String[] args) {
        int number = 3;
        int m, n, p;

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
            int value1 = m;
            for (n = 1; n <= m; n++) {

                System.out.print(value1);
                value1--;
            }
            int value2 = m;
            for (p = 1; p <= m - 1; p++) {
                System.out.print(value2);
                value2++;
            }

            // Ending line after each row
            System.out.println();
        }
    }
}
