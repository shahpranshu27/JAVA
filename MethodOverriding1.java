class Bank{
    int getRateOfInterest(){return 0;}
}
class SBI extends Bank{
    int getRateOfInterest(){return 7;}
}
class ICICI extends Bank{
    int getRateOfInterest(){return 8;}
}
class AXIS extends Bank{
    int getRateOfInterest(){return 9;}
}
public class MethodOverriding1 {
    public static void main(String[] args) {
        SBI s = new SBI();
        AXIS a =  new AXIS();
        ICICI i = new ICICI();

        System.out.println("SBI : "+s.getRateOfInterest());
        System.out.println("ICICI : "+i.getRateOfInterest());
        System.out.println("AXIS : "+a.getRateOfInterest());
    }
}
