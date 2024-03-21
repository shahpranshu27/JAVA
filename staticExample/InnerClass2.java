package staticExample;

public class InnerClass2 {
    static class Test3{
        String name3; // here, name3 variable is not static, so it can take different values everytime

        public Test3(String name3){
            this.name3 = name3;
        }
    }

    // Static nested classes allow you to create separate instances with their own variables, unlike static variables that share a single value across all instances.

    public static void main(String[] args) {
        Test3 a3 = new Test3("a3");
        Test3 b3 = new Test3("b3");

        System.out.println(a3.name3);
        System.out.println(b3.name3);
    }
}
