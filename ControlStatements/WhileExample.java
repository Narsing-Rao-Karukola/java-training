
public class WhileExample {
    public static void main(String[] args) {

        int i = 0;
        while (i < 10) {
            i++;
            if (i % 2 == 0) {
                System.out.println(i + " even num");
            } else if (i == 5) {

                continue;
            } else {
                System.out.println(i + " odd num");
            }
            System.out.println("hey");
            if (i == 5) {
                continue;
            }
            System.out.println(i);

        }
    }
}
