// Use of synchronized
public class Thread3 {
    public static void main(String[] args) {
        CallMe Baman = new CallMe();
        Caller Khushi = new Caller(Baman, "let's go for lunch");
        Caller Nishka = new Caller(Baman, "let's go for dinner");

        Thread t1 = new Thread(Khushi);
        Thread t2 = new Thread(Nishka);

        t1.start();
        t2.start();
    }
}

class CallMe{
    synchronized void call(String msg){
        System.out.print("[ "+msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(" ]");
    }
}

class Caller extends Thread{
    String msg;
    CallMe target;
    public Caller(CallMe target, String msg){
        this.msg = msg;
        this.target = target;
    }

    public void run(){
        target.call(msg);
    }
}