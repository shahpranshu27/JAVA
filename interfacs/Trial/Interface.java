package interfacs.Trial;

interface Vehicle{
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}

class Bicycle implements Vehicle{
    int speed;
    int gear;
    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }
    @Override
    public void speedUp(int increment) {
        speed+=increment;
    }
    @Override
    public void applyBrakes(int decrement) {
        speed -= decrement;
    }

    public void printStates(){
        System.out.println("speed: "+speed+" \ngear: "+gear);
    }
}

class Bike implements Vehicle{

    int speed;
    int gear;

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }
    @Override
    public void speedUp(int increment) {
        speed+=increment;
    }
    @Override
    public void applyBrakes(int decrement) {
        speed -= decrement;
    }
    public void printStates(){
        System.out.println("speed: "+speed+" \ngear: "+gear);
    }
}

public class Interface {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);
        System.out.println("bicycle present state: ");
        bicycle.printStates();

        Bike bike = new Bike();
        bike.changeGear(3);
        bike.speedUp(4);
        bike.applyBrakes(2);
        // bike.changeGear(5);
        System.out.println("bike present state: ");
        bike.printStates();
    }
}
