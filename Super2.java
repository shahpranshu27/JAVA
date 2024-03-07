// invoke arent class method
class Animal{
    void eat(){
        System.out.println("Eating..!!");
    }
}
class Dog extends Animal{
    void eat(){System.out.println("Eating roti..!!");}
    void bark(){System.out.println("Barking..!!");}

    void work(){
        eat(); // this would print eat() from child class i.e. "Eating roti"
        super.eat(); // this would call parent class, and print "Eating"
        bark();
    }
}
public class Super2 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.work();
    }
}