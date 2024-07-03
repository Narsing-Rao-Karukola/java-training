
public class NestedConditionalStatements {
    public static void main(String[] args) {
        int a = 100;
        if(a > 200){
            if(a % 2 == 0){
                System.out.println("a is even");
            } else {
                System.out.println("a is odd");
            }
        } else {
            if(a/5 == 10){
                System.out.println("out is 10");
            } else if(a/10 == 10){
                System.out.println("divs by 10");
            } else{
                System.out.println("a is num");
            }
            System.out.println("hyy");
        }
    }
}
