package interfacs.extendDemo2;

public class Main implements A, B{
    // if i implement A, then i won't be able to use greet() method, but if i implement B, then B extends A, thus i can use both methods

    // implements : classes to interfaces
    // extends : interface to interface
    @Override
    public void fun() {

    }

    @Override
    public void greet() {
        
    }

    public static void main(String[] args) {
        // Main obj = new Main();
        A.greeting();
    }
    
}
