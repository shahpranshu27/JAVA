package interfacs;

public class NiceCar {
    private Engine engine;
    private Media player = new CDPlayer();

    // public NiceCar() {
    //     engine = new PowerEngine();
    // }
    public NiceCar() {
        engine = new ElectricEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }
    
    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void startMusic(){
        player.start();
    }

    public void stopMusic(){
        player.stop();
    }

    // public void upgradeEngine(Engine engine){
    //     this.engine = engine;
    // }
    public void upgradeEngine(){
        this.engine = new PowerEngine();
    }

}
