package staticExample;

public class StaticBlock {
    static int a = 4;
    static int b;

    // will run only once, when the first object is created i.e. when class is laded for the first time
    static {
        System.out.println("inside the static block!");
        b = a*5;
    }
    static class A{
        String name;

        public A(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a +" "+ StaticBlock.b);    

        StaticBlock.b += 3;

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a +" "+ StaticBlock.b);

        A a = new A("null"); // giving an error if it's inside the main class, as it has not been initialized by the object
        System.out.println(a.name); // if assigned with static operator, it wont give error because it now doesn't require an object
    }
}
