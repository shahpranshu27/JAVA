interface Drawable2{
    void draw();
}
class Rectangele implements Drawable2{
    public void draw(){System.out.println("drawing rectangle");}
}
class Circle implements Drawable2{
    public void draw(){System.out.println("drawing circle");}
}
public class Interface1 {
    public static void main(String[] args) {
        Drawable2 d = new Rectangele();
        d.draw();

        Drawable2 d1 = new Circle();
        d1.draw();
    }
}