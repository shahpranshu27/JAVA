public class LogicalOperator {
    public static void main(String[] args) {
        int a=10, b=20, c=30;

        // && operator i.e. both the conditions should be true
        if((b>a) && (c>b)){
            int d = a+b+c;
            System.out.println("Sum: "+d);
        }
        else{
            System.out.println("False condition!");
        }

        // || operator (OR) i.e. at least 1 condition should be true
        if((b>a) || (b>c)){
            int d = a+b+c;
            System.out.println("Sum: "+d);
        }
        else{
            System.out.println("False condition!");
        }
    }
}
