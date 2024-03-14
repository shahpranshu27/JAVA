public class Scope {
    public static void main(String[] args) {
        int a = 2;
        System.out.println("a in main function: "+a);
        {
            a = 3; // reassigned the original reference variable to some other value i.e. only the value is reassigned, it has not initialized a new variable, hence the value would be changed
            System.out.println("a in block scope: "+a);
            int b = 4;
            System.out.println("initialized b in block scope: "+b);
            // values initialized in the block, remains in the block
        }
        System.out.println("a outside block scope again: "+a);
    }
}
