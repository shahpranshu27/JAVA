package Polymorphism;

public class Main {
    public static void main(String[] args) {
        // Shapes shape = new Shapes();
        // Circle circle = new Circle();
        // Square square = new Square();
        // Shapes circle1 = new Circle(); 
        // Shapes square1 = new Square();
        // Triangle triangle = new Triangle();
        Shapes shape1 = new Shapes();
        shape1.area();

        // Remember: in java, by default, every class extends the Object class
        Shapes sq1 = new Square();
        sq1.area();

        // here, since the type of referewnce variable is Shapes, there must be area() method in shape. if there's no area() in Shapes.java, it will thorow an error
        Shapes c1 = new Circle();
        c1.area();

        // Shapes c2 = new Circle();
        // c2.area1(); // see, this will give an error, as there's no area1() method in Shapes class, but the reference type we had assigned was of Shapes class

        // Circle c3 = new Circle();
        // c3.area1(); // see, here since the reference type class is also Circle, and the object type is Circle, thus we can access area1() method


        // if I have the type of reference variable as parent class, but the object is of the type sub class 

        // parent_class obj = new chile_class();
        // here, which method will be called depends on the child_class(). this is called upcasting 
        // and, this entire thing is how overriding works

        // in override, it depends on what is on the right side
        // and, the reference type should have a method area too. if I comment out method area from shape, and @Override from the Cirlce.java, then it will throw an error, as there's no method area in the reference type 
        // IMPORTANT : what it's able to access is defined by the type of reference, and which one it's able to access is defined by the type of object
        // shape.area();
        // circle.area();
        // square.area();
        // circle1.area();
        // square1.area();
        // triangle.area();
    }
}
