class Bank5{
    float getRateOfInterest(){return 0;}
}
class SBI2 extends Bank5{
    float getRateOfInterest(){return 6.7f;}
}
class AXIS2 extends Bank5{
    float getRateOfInterest(){return 7.7f;}
}
class ICICI2 extends Bank5{
    float getRateOfInterest(){return 5.7f;}
}
public class Polymorphism {
    public static void main(String[] args) {
        Bank5 b;
        b = new SBI2();
        System.out.println("SBI : "+b.getRateOfInterest());
        b = new AXIS2();
        System.out.println("AXIS : "+b.getRateOfInterest());
        b = new ICICI2();
        System.out.println("ICICI : "+b.getRateOfInterest());
    }
}