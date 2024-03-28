public class Exception {
    public static void main(String[] args) {
        int a=30,b=0;
        try{
            int c = a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
