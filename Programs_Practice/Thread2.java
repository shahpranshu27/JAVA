public class Thread2 {
    public static void main(String[] args) {
        MyThread m1 = new MyThread();
        m1.setName("xyz");
        m1.start();
        
        try {
            m1.join(3000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        for (int i = 1; i <= 3; i++) {
            System.out.println("Main thread--> "+i);
        }
    }
}

class MyThread extends Thread{
    public void run(){
        Thread t1 = Thread.currentThread();
        for (int i = 1; i <= 5; i++) {
            System.out.println("--> "+i+" by "+t1.getName());

            try {
                t1.join(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}