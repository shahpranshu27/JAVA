class Animal{
    void eat(){System.out.println("Eating..!!");}
}
class Dog extends Animal{
    void bark(){System.out.println("Barking..!!");}
}
class Cat extends Animal{
    void meow(){System.out.println("Meowing.!!");}
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
        c.meow();
        // c.bark(); cat can not bark, because it doesn't inherit attribute from Dog, bout only from Animal
        // similarly, dog can't meow, because we have not inherited attributes of cat in dog
    }
}
