// package CommonPrograms;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number"); //321
        int num = scanner.nextInt();
        int reverse = 0;
        while (num != 0) {
            int temp = num % 10; //3
            reverse = reverse * 10 + temp; // 123
            num = num / 10;
        }
        System.out.println(reverse);

    }
}
