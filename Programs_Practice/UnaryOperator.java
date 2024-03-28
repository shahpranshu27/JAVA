public class UnaryOperator {
    public static void main(String[] args) {
        int n1 = 10;
        System.out.println("Number: "+n1);

        // performing unary minus
        // n1 = -n1; // negate the number
        // System.out.println("Result: "+n1);

        boolean cond = true;
        int a=10, b=1;
        System.out.println("Condition: "+cond);
        System.out.println("(a<b): "+(a<b));
        System.out.println("(a>b): "+(a>b));

        // applying unary NOT (!) operator, see that the result is reversed
        System.out.println("Condition now: "+!(cond));
        System.out.println("!(a<b): "+!(a<b)); 
        System.out.println("!(a>b): "+!(a>b));
    }
}
