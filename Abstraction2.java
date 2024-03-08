abstract class Bank{
    abstract int getRateOfInterest();
}
class SBI extends Bank{
    int getRateOfInterest(){return 7;}
}
class PNB extends Bank{
    int getRateOfInterest(){return 8;}
}
public class Abstraction2 {
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println("SBI Rate : "+b.getRateOfInterest());

        b = new PNB();
        System.out.println("PNB Rate : "+b.getRateOfInterest());
    }
}