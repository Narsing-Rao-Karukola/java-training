public class BitwiseOperator {
    public static void main(String[] args) {
        //Bit wise operator 
        // & bitwise AND 
        // | bitwise OR
        // ^ bitwise XOR
        // ~ bitwise complement
        // >> bitwise right shift
        // << bitwise left shift 
        //0 - false 1 - true
        /*
         * 2 - 10
         * 3 - 11
         * | - 11 - 3
         * 
         * 
         * 11 - 001011
         * 33 - 100001
         * !  - 101011
         * 
         * 11 - 001011
         * 22 - 100001
         * &  - 000001
         * 
         * 11 - 001011
         * 22 - 100001
         * ^ -  101010
         * 
         * 42 - 101010
         * ~  - 010101
         */

        System.out.println(2|3);
        System.out.println(11|33);
        System.out.println(11&33);
        System.out.println(11^33);
        System.out.println(~42);
        System.out.println(2<<2);
        System.out.println(56>>2);
        System.out.println('A'|'u');
    }
}