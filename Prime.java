public class Prime {
    // public static void main(String[] args) {
    //     int m=0, flag=0;
    //     int n=23;
    //     m=n/2;
    //     if(n==0 || n==1){
    //         System.out.println(n+" is not a prime number");
    //     }
    //     else{
    //         // if n gets divided by any number from 2 to n/2, then number is not prime and thus flag=1
    //         for(int i=2; i<=m; i++){
    //             if(n%i==0){
    //                 System.out.println(n+" is not a prime number");
    //                 flag=1;
    //                 break;
    //             }
    //         }
    //         // if flag==0, then it means that number is prime number
    //         if(flag==0){ System.out.println(n+" is a prime number");}
    //     }
    // }

    // using method
    static void checkPrime(int n){
        int m=0, flag=0;
        m=n/2;
        if(n==0 || n==1){
            System.out.println(n+" is not a prime number");
        }
        else{
            for(int i=2; i<=m; i++){
                if(n%i==0){
                    System.out.println(n+" is not a prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(n+" is a prime number");
            }
        }
    }
    public static void main(String[] args) {
        checkPrime(3);
        checkPrime(6);
        checkPrime(9);
        checkPrime(11);
    }
}
