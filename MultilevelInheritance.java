class Animal4{
    void eat(){System.out.println("Eating..!!");}
}
class Dog4 extends Animal4{
    void bark(){System.out.println("Barking..!!");}
}
class Cat4 extends Dog4{
    void meow(){System.out.println("Meowing..!!");}
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        Cat4 c = new Cat4();
        c.eat();
        c.bark();
        c.meow();
    }
}
