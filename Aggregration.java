class Operation{
    int square(int n){
        return n*n;
    }
}
class Circle{
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
        Circle c = new Circle();
        double result = c.area(5);
        System.out.println(result);
    }
}