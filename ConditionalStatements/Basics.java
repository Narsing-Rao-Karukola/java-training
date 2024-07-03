
public class Basics {
    public static void main(String[] args) {
        boolean b = false;
        int a = 10;

        //state in if block
        if(!b){
            System.out.println("simple if ");
            ++a;
            System.out.println(a);
        } 

        //if else
        if(a < 11){
            System.out.println("a is larger num");
        } else {
            System.out.println("a is smaller num");
        }

        //else if
        if(a > 11){
            System.out.println("a is larger num");
        } else if(a == 101){
            System.out.println("a is equals to 10");
        } else {
            System.out.println("a is smaller num");
        }

        //if else ladder
        if(a > 11){
            System.out.println("a is larger num");
        } else if(a == 101){
            System.out.println("a is equals to 10");
        } else if(!b){
            System.out.println("b is true");
        }
         else {
            System.out.println("a is smaller num");
        }
        System.out.println("hey");
    }
}
