interface Drawable1{
    void draw();
    static int cube(int x){return x*x*x;}
}
class Rectangle implements Drawable1{
    public void draw(){System.out.println("Drawing rectangle");}
}
public class StaticInterface {
    public static void main(String[] args) {
        Drawable1 d = new Rectangle();
        d.draw(); 
        System.out.println(Drawable1.cube(4));
    }
}