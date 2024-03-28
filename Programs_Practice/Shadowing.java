public class Shadowing {
    static int x = 80; // this has scope of whole public class Shadowing
    static int y = 4;
    public static void main(String[] args) {
        System.out.println(x); // prints 80
        int x = 3; //this has scope of main function
        System.out.println(x); // prints 3, that is x that was declared out of the main function will be shadowed
        int y; // declaring
        // System.out.println(y); // this would give an error as we have declared the variable inside the scope, but have not initialized it
        y = 5; // initializing
        System.out.println(y);
        fun();
    }

    static void fun(){
        System.out.println(x); // prints 80
    }

}
