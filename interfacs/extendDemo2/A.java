package interfacs.extendDemo2;

public interface A {

    // static interface method should have a body
    // call via the interface name
    // static void greeting(); // this will give an error
    static void greeting(){
        System.out.println("I am a static method!");
    }

    default void fun(){
        System.out.println("I am in A");
    };
}
