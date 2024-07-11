// package Recursion;

public class RecursionExample {
    public static void main(String[] args) {
        RecursionExample obj = new RecursionExample();
        int f = obj.factorial(5);
        System.out.println(f);
    }

    public int factorial(int n) {
        if (n == 1) {
            return n * 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

// !5 = 5*4*3**2*1 120