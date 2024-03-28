public class AssignmentOperator {
    public static void main(String[] args) {
        int num1, num2;
        String name;
        
        // = operator assigns the value
        num1 = 10;
        num2 = 100;
        name = "Pranshu";
        System.out.println("num: "+num1);
        System.out.println("name: "+name);

        // += operator
        System.out.println("num1 += 10: "+(num1 += 10));

        // -= operator
        System.out.println("num1 -= 10: "+(num2 -= 10));

        // *= operator
        System.out.println("num1 *= 10: "+(num1 *= 10));

        // /= operator
        System.out.println("num1 /= 10: "+(num1 /= 10));

        // %= operator
        System.out.println("num1 %= 6: "+(num1 %= 6));
    }
}
