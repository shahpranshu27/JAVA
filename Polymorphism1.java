class Shape4{  
    void draw(){System.out.println("drawing...");}  
    }  
    class Rectangle extends Shape4{  
    void draw(){System.out.println("drawing rectangle...");}  
    }  
    class Circle extends Shape4{  
    void draw(){System.out.println("drawing circle...");}  
    }  
    class Triangle extends Shape4{  
    void draw(){System.out.println("drawing triangle...");}  
}  
class Polymorphism1{  
    public static void main(String args[]){  
    Shape4 s;  
    s=new Rectangle();  
    s.draw();  
    s=new Circle();  
    s.draw();  
    s=new Triangle();  
    s.draw();  
    }  
}