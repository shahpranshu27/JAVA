public class ShiftOperator {
    public static void main(String[] args) {
        int a = 64, b;
        int i;

        // left shift operator
        i = a<<2;
        b = (byte)(a<<2);
        System.out.println("Original value of a: "+a);
        System.out.println("i and b: "+i+" "+b);

        // right shift operator
        int ans = a>>2;
        System.out.println("a>>2: "+ans);
    }
}