
public class Pen {
    int height = 10;
    static String color = "t";
    public static void main(String[] args) {
        Pen p1 = new Pen();// cello
        Pen p2 = new Pen();// re
        Pen p3 = new Pen();// z
        p1.setPen(14);
        p2.setPen(24);
        p3.setPen(7);
        System.out.println(p1.getPenHeight()+ ", color = "+p1.color);
        p1.color = "red";
        System.out.println(p2.getPenHeight()+ ", color = "+p1.color);
        Pen.color = "blue";
        System.out.println(p3.getPenHeight()+ ", color = "+p1.color);
        System.out.println(Pen.color);
    }

    public void setPen(int height) {
        this.height = height;
    }

    public int getPenHeight() {
        return this.height;
    }
}
