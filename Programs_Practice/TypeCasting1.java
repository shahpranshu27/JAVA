public class TypeCasting1 {
    public static void main(String[] args) {
        byte b = 40;
        short s = 1024;
        char c = 'a';
        int i = 30000;
        float f = 4.69f;
        double d = 0.1254;
        double result = (f*b)+(i/c)+(d-s);
        System.out.println((f*b)+" "+(i/c)+" "+(d-s));
        // output : float + int - double => double
        System.out.println(result);
    }
}
