package Polymorphism;

public class Numbers {
    double sum(double a, int b){
        return a+b; 
    }

    double sum(int a, int b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }

    // this program is an examle of method overloading

    public static void main(String[] args) {
        Numbers n1 = new Numbers();
        System.out.println("sum1: "+n1.sum(2,3)); // even though a is input as int, it will be automatically typecasted into double
        System.out.println("sum2: "+n1.sum(2,3,4));
        // System.out.println("sum2: "+n1.sum(2,3,4, 5)); // this will give an error as there is no sum method which takes 4 arguements

        System.out.println("sum1: "+n1.sum(2.34,3));
    }
}
