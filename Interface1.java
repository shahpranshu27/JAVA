interface Drawable{
    void draw();
}
class Rectangele implements Drawable{
    public void draw(){System.out.println("drawing rectangle");}
}
class Circle implements Drawable{
    public void draw(){System.out.println("drawing circle");}
}
public class Interface1 {
    public static void main(String[] args) {
        Drawable d = new Rectangele();
        d.draw();

        Drawable d1 = new Circle();
        d1.draw();
    }
}