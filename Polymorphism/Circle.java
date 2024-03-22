package Polymorphism;

public class Circle extends Shapes{
    // this will run when object of circle is created, hence it is overriding the parent method
    @Override // this is called annotation
    void area(){
        System.out.println("I am in circle!");
    }

    void area1(){
        System.out.println("Am i in circle??");
    }
}
