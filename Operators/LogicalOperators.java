public class LogicalOperators {
    public static void main(String[] args) {
        // Logical Operators
        /*
         * t = true , f - false
         * && AND
         * t && t = t
         * f && t = f
         * t && f = f
         * f && f = f
         * 
         * || OR
         * t || t = t
         * f || t = t
         * t || f = t
         * f || f = f
         * 
         * !
         * !t = f
         * !f = t
         */

        char c1 = '*';
        char c2 = 's';
        System.out.println((c1 == '*' && c1 == c1));
        System.out.println((c1 == '*' && c1 == c2));
        System.out.println((c1 == '8' && c2 == c2));
        System.out.println((c1 == '8' && c2 != c2));
        System.out.println((c1 == '*' || c1 == c1));
        System.out.println((c1 == '*' || c1 == c2));
        System.out.println((c1 == '8' || c2 == c2));
        System.out.println((c1 == '8' || c2 != c2));
        System.out.println(!(c2 != c2));

    }
}
