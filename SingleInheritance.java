class Animal1{
    void eat(){
        System.out.println("Eating..!!");
    }
}
class Dog extends Animal1{
    void bark(){System.out.println("Barking..!!");}
}
public class SingleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}
