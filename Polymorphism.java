class Bank{
    float getRateOfInterest(){return 0;}
}
class SBI extends Bank{
    float getRateOfInterest(){return 6.7f;}
}
class AXIS extends Bank{
    float getRateOfInterest(){return 7.7f;}
}
class ICICI extends Bank{
    float getRateOfInterest(){return 5.7f;}
}
public class Polymorphism {
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println("SBI : "+b.getRateOfInterest());
        b = new AXIS();
        System.out.println("AXIS : "+b.getRateOfInterest());
        b = new ICICI();
        System.out.println("ICICI : "+b.getRateOfInterest());
    }
}