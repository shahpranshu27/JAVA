public class BitwiseOperator {
    public static void main(String[] args) {
        int a=5, b=12;

        // bitwise operators work in binary terms, i.e. they convert any numbers into binary numbers
        // Bitwise AND operator
        System.out.println("a&b: "+(a&b));

        // bitwise OR operator
        System.out.println("a|b: "+(a|b));

        // bitwise XOR operator
        System.out.println("a^b: "+(a^b));

        // bitwise not operator i.e. 2's complement
        System.out.println("~a: "+(~a));

    }
}