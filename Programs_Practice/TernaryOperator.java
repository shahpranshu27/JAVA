public class TernaryOperator {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20;
        System.out.println("num1 : "+num1);
        System.out.println("num2 : "+num2);

        // using ternary operator to check which one is greater
        // ternary operator is just similar to if - else condition, written in one line
        int max = (num1>num2)?num1:num2;
        System.out.println("max: "+max);
    }
}
