abstract class Bike{
    Bike(){System.out.println("Bike is running");}
    abstract void run();
    void changeGear(){System.out.println("Gear changing");}
}
class Honda extends Bike{
    void run(){System.out.println("honda running");}
}
public class Abstraction3 {
    public static void main(String[] args) {
        Bike b1 = new Honda();
        b1.changeGear();
        b1.run();
    }
}