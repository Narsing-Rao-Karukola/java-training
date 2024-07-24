public class Pen {
    int height = 10;
    float radius = 1.2f;
    String color = "blue";
    boolean isInkAvailable = true;

    void write() {
        System.out.println("Wrirting");
    }

    void refill() {
        System.out.println("re filling the ink");
    }



    Pen p1 = new Pen();
    Pen p2 = new Pen();
    Pen p3 = new Pen();
    Pen p4 = new Pen();
    Pen p5 = new Pen();
    Pen p6 = new Pen();
    Pen p7 = new Pen();
    void display(){
        if(p1.isInkAvailable == false){
            p1.refill();
        }
    }
}
