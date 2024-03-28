// invoke arent class method
class Animal3{
    void eat(){
        System.out.println("Eating..!!");
    }
}
class Dog3 extends Animal3{
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
        Dog3 d = new Dog3();
        d.work();
    }
}