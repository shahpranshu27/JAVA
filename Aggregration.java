class Operation{
    int square(int n){
        return n*n;
    }
}
class Circle1{
    // Operation op;
    double pi = 3.14;

    double area(int radius){
        Operation op = new Operation();
        int rsquare = op.square(radius); // square of radius, then multiplied by value of pi
        return pi*rsquare;
    }
}
public class Aggregration {
    public static void main(String[] args) {
        Circle1 c = new Circle1();
        double result = c.area(5);
        System.out.println(result);
    }
}