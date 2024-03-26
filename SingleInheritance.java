class Animal1{
    void eat(){
        System.out.println("Eating..!!");
    }
}
class Dog4 extends Animal1{
    void bark(){System.out.println("Barking..!!");}
}
public class SingleInheritance {
    public static void main(String[] args) {
        Dog4 d = new Dog4();
        d.bark();
        d.eat();
    }
}
