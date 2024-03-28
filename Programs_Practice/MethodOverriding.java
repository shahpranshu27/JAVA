class Vehicle{
    void run(){System.out.println("Vehicle is running");}
}
class Bike1 extends Vehicle{
    void run(){System.out.println("Bike is running");}
}
public class MethodOverriding {
    public static void main(String[] args) {
        Bike1 b1 = new Bike1();
        b1.run();
    }
}
