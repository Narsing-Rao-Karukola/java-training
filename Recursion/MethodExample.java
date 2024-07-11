// package Recursion;

public class MethodExample {
    public static void main(String[] args) {
        MethodExample obj1 = new MethodExample();
        obj1.display();
        String s = obj1.f1();
        int i = obj1.f2();
        String s1 = obj1.f3(10, 20, "heyy");
        System.out.println(s);
        System.out.println(i);
        System.out.println(s1);

    }

    public void display() {
        System.out.println("Dis");
        // display();
    }

    public String f1() {
        return "f1 method";
    }

    public int f2() {
        return 3;
    }

    public String f3(int a, int b, String c) {
        return a + b + c;
    }
}

// access_modifers return_type function_name(parameters) //signature
// {
// //method body
// }

// access_modifiers public protected private
// return_type void/any datatype
// _Do display Display1233
// access_specifier static & non-static
