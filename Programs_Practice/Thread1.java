public class Thread1 {
    public static void main(String[] args) {
        Sender sender = new Sender("abc");
        Reciever reciever = new Reciever();
        Thread t = new Thread(reciever, "def");
        sender.start();
        t.start();
    }
}

class Sender extends Thread{
    Sender(String s){
        super(s);
    }

    public void run(){
        Thread t1 = Thread.currentThread();
        for (int i = 1; i <= 3; i++) {
            System.out.println("Sending message --> "+i+" by "+t1.getName());
        }
    }
}

class Reciever implements Runnable{

    @Override
    public void run() {
        Thread t2 = Thread.currentThread();
        for (int i = 1; i <= 3; i++) {
            System.out.println("Recieving message --> "+i+" by "+t2.getName());
        }
    }
}