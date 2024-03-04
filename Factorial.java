public class Factorial {
    static void fact(int n){
        int f=1;
        for(int i=n; i>0; i--){
            f = f*i;
        }
        System.out.println("factorial of "+n+" is : "+f);
    }
    public static void main(String[] args) {
        fact(4);
        fact(7);
        fact(0);
    }
}
