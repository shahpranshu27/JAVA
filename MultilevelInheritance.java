class Animal{
    void eat(){System.out.println("Eating..!!");}
}
class Dog extends Animal{
    void bark(){System.out.println("Barking..!!");}
}
class Cat extends Dog{
    void meow(){System.out.println("Meowing..!!");}
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
        c.bark();
        c.meow();
    }
}
