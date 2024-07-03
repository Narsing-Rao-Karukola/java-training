// package Commons;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        //int
        //long
        //float
        //double
        //boolean
        //char
        //string
        // int  i =10;
        // ScannerExample c = new ScannerExample();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter int value:");
        int i = scanner.nextInt(); // int
        System.out.println("Enter Long value:");
        long l = scanner.nextLong(); // long 
        System.out.println("Enter float value:");
        float f = scanner.nextFloat(); // float
        System.out.println("Enter Double value:");
        double d = scanner.nextDouble(); // double
        System.out.println("Enter Boolean value:");
        boolean b = scanner.nextBoolean(); // boolean
        System.out.println("Enter String  value:");
        String s = scanner.next(); // string - word
        System.out.println("Enter multi String  value:");
        String ml = scanner.nextLine(); // sting line - combination of words with spaces
        System.err.println("Enter Char");
        char c = scanner.next().charAt(0); //hello
                                                 //01234 

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("int "+i);
        System.out.println("long "+l);
        System.out.println("float "+f);
        System.out.println("double "+d);
        System.out.println("boolean "+b);
        System.out.println("string "+s);
        System.out.println("Multi string "+ml);
        System.out.println("Char "+c);



        // System.out.println("jjj" + s);
    }
}
