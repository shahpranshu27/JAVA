class Rectangle{
    int length;
    int width;
    // void insert(int l, int w){
    //     length = l;
    //     width = w;
    // }
    
    // parameterized contructor
    Rectangle(int l, int w){
        length = l;
        width = w;
    }
    void calculalateArea(){System.out.println(length*width);}
    void calculatePerimeter(){System.out.println(2*(length+width));}
}
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5,6);
        // Rectangle r2 = new Rectangle();
        // r1.insert(5,6);
        // r2.insert(10,12);
        r1.calculatePerimeter();
        // r2.calculatePerimeter();
        r1.calculalateArea();
        // r2.calculalateArea();
    }
}
