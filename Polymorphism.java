class Bank5{
    float getRateOfInterest(){return 0;}
}
class SBI extends Bank5{
    float getRateOfInterest(){return 6.7f;}
}
class AXIS extends Bank5{
    float getRateOfInterest(){return 7.7f;}
}
class ICICI extends Bank5{
    float getRateOfInterest(){return 5.7f;}
}
public class Polymorphism {
    public static void main(String[] args) {
        Bank5 b;
        b = new SBI();
        System.out.println("SBI : "+b.getRateOfInterest());
        b = new AXIS();
        System.out.println("AXIS : "+b.getRateOfInterest());
        b = new ICICI();
        System.out.println("ICICI : "+b.getRateOfInterest());
    }
}