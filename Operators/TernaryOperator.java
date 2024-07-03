public class TernaryOperator {
    public static void main(String[] args) {
        // Ternary Operator
        // (condition) ? (exp1) :(exp2)
        // System.out.println(!true?"He":"She");
        int a = 10;
        int b = 100;
        int c = b > a ? b : a;
        System.out.println(c + " is the largest number");
    }
}
