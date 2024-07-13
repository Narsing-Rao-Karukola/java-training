// package Patterns;

public class RightSidePyramid {
    public static void main(String[] args) {
        int size = 5;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            for (int k = size; k > i+1; k--) {
                System.out.print("9");
            }
            System.out.println();
        }
    }
}
