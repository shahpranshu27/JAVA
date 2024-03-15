public class RelationalOperator {
    public static void main(String[] args) {
        int n1=10, n2=10, n3=20;
        System.out.println("n1: "+n1);
        System.out.println("n2: "+n2);
        System.out.println("n3: "+n2);

        // == operator 
        System.out.println("n1 == n2: "+(n1 == n2));
        System.out.println("n2 == n3: "+(n2 == n3));

        // != operator
        System.out.println("n1 != n2: "+(n1 != n2));
        System.out.println("n2 != n3: "+(n2 != n3));

        // > & < operator
        System.out.println("n1 > n2: "+(n1 > n2));
        System.out.println("n2 < n3: "+(n2 > n3));

        // >= & <= operator
        System.out.println("n1 >= n2: "+(n1 >= n2));
        System.out.println("n2 <= n3: "+(n2 <= n3));
    }
}
