// invoke parent class constructor
class Animal4{
    Animal4(){
        System.out.println("Animal is created");
    }
}
class Dog4 extends Animal4{
    Dog4(){
        super();
        System.out.println("Dog is created");
    }
}
public class Super3 {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Dog4 d = new Dog4();
        
    }
}
