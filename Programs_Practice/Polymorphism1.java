class Shape4{  
    void draw(){System.out.println("drawing...");}  
    }  
    class Rectangle2 extends Shape4{  
    void draw(){System.out.println("drawing rectangle...");}  
    }  
    class Circle2 extends Shape4{  
    void draw(){System.out.println("drawing circle...");}  
    }  
    class Triangle2 extends Shape4{  
    void draw(){System.out.println("drawing triangle...");}  
}  
class Polymorphism1{  
    public static void main(String args[]){  
    Shape4 s;  
    s=new Rectangle2();  
    s.draw();  
    s=new Circle2();  
    s.draw();  
    s=new Triangle2();  
    s.draw();  
    }  
}