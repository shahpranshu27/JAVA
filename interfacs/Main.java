package interfacs;

public class Main {
    public static void main(String[] args) {
        // Car car1 = new Car();
        // // Engine car1 = new Car();

        // // car1.a;
        // car1.acc();
        // car1.start();
        // car1.stop();
        // car1.brake();

        // Media carMedia = new Car();
        // carMedia.start();
        // carMedia.stop();

        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
    }
}
