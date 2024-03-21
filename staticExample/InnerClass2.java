package staticExample;

public class InnerClass2 {
    static class Test3{
        String name3; // here, name3 variable is not static, so it can take different values everytime

        public Test3(String name3){
            this.name3 = name3;
        }
    }

    // Static nested classes allow you to create separate instances with their own variables, unlike static variables that share a single value across all instances.

    // Instances are concrete objects created from a class.
    // Each instance has its own set of instance variables to store its own data.
    // Static nested classes allow you to create instances even without an instance of the outer class.
    // Instance variables, unlike static variables, have separate values for each instance.
    public static void main(String[] args) {
        Test3 a3 = new Test3("a3");
        Test3 b3 = new Test3("b3");

        System.out.println(a3.name3);
        System.out.println(b3.name3);
    }
}
