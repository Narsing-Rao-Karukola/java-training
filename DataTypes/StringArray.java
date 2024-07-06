import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {

        //Define scanner
        Scanner inputScanner = new Scanner(System.in);

        //Read the length of array
        System.out.println("What is your array length");
        int arrayLength = inputScanner.nextInt();

        //Create the array object by passing length
        String[] stringArr = new String[arrayLength];

        //Take the inputs from scanner object using a loop and assign them to array
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Enter " + i + "th index value:");
            //assign them to array
            stringArr[i] = inputScanner.next();
        }

        //Display the Array
        System.out.println();
        System.out.println("The String Array:");
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(stringArr[i] + " ");
        }
    }
}

{
/*
 * Dynamic Arrays
 * 
 * Define scanner
 * Read the length of array
 * Create the array object by passing length
 * Take the inputs from scanner object using a loop and assign them to array
 * Display the Array
 * 
 */
}