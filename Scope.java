public class Scope {
    public static void main(String[] args) {
        int a = 2; // here, we are initializing the variable a and stoing a value in it
        System.out.println("a in main function: "+a);
        {
            a = 3; // reassigned the original reference variable to some other value i.e. only the value is reassigned, it has not initialized a new variable, hence the value would be changed
            // here, we are just updating the value of a in simple terms
            System.out.println("a in block scope: "+a);
            int b = 4; // here, b is initialized inside the block, so it can not be accesed outside the block
            System.out.println("initialized b in block scope: "+b);
            // values initialized in the block, remains in the block
        }
        System.out.println("a outside block scope again: "+a);
    }
}
