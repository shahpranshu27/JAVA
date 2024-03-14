class Bank1{
    int getRateOfInterest(){return 0;}
}
class SBI1 extends Bank1{
    int getRateOfInterest(){return 7;}
}
class ICICI1 extends Bank1{
    int getRateOfInterest(){return 8;}
}
class AXIS1 extends Bank1{
    int getRateOfInterest(){return 9;}
}
public class MethodOverriding1 {
    public static void main(String[] args) {
        SBI1 s = new SBI1();
        AXIS1 a =  new AXIS1();
        ICICI1 i = new ICICI1();

        System.out.println("SBI : "+s.getRateOfInterest());
        System.out.println("ICICI : "+i.getRateOfInterest());
        System.out.println("AXIS : "+a.getRateOfInterest());
    }
}
