public class Example {
    int i = 10;
    static int j = 11;
    public static void main(String[] args) {
        Example obj = new Example();
        Example obj1 = new Example();
        Example obj2 = new Example();
        obj.updataI(11);
        obj1.updataI(122);
        obj2.updataI(33);
    }


    public void updataI(int p){
        System.out.println(this.i);
        this.i = p;
        System.out.println(this.i);
    }
    // package Methods;

    public static int add(int a, int b) {
        return a + b;
    }

    public static boolean checkAge(int age) {
        return age > 18 ? true : false;
    }

    public void M1() {
        System.out.println("M1");
    }

}

class Example2 {
    public void M1() {
        System.out.println("M1");
    }

    void M2(double d) {
        System.out.println("M2" + d);
    }

    protected void M3() {
        System.out.println("M3");
    }

    private void M4() {
        System.out.println("M4");
    }
}