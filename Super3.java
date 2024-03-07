// invoke parent class constructor
class Animal{
    Animal(){
        System.out.println("Animal is created");
    }
}
class Dog extends Animal{
    Dog(){
        super();
        System.out.println("Dog is created");
    }
}
public class Super3 {
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}
