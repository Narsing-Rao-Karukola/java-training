package DataTypes;

public class ArrayExample {
    public static void main(String[] args) {
        int[] intArray = { 23, 4545, 5656, 67676 , 4587};
        // int[] intArray1 = new int[9];
        System.out.println("Original Array:");
        //Displaying array or accessing array 
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }

        //Updating or modify array
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i * 2;
        }
        
        System.out.println();
        System.out.println("Modified Array:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
        System.out.println(intArray.length);

    }
}