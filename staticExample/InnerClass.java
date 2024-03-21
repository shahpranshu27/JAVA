package staticExample;

public class InnerClass {
    // class Test{
    //     // Remember, outside classes can never be static
    //     // In this case, InnerClass is an outside class, it can never be static because it itself can not be dependent on any other class but class Test is dependent on outside class
        
    //     String name;

    //     public Test(String name){
    //         this.name = name;
    //     }
    // }

    static class Test1{
        String name1;

        public Test1(String name1){
            this.name1 = name1;
        }
    }

    public static void main(String[] args) {
        // here, if class is not defined or assigned static, we can not access it in main class, for the same reason as non static can not be accessed in static class 
        // if we assign class Test as static, then we can use it 
        // or if we keep the class Test outside the main class i.e. InnerClass, it will work completely fine, but here, since class Test itself is inside the InnerClass, it is dependent on an object 
        // here's the perfect and simple explaination of why non static class Test can't be used inside the main class: 
        // Imagine you have a big house called "Main". Inside this house, you have a room called "Test". Now, this room "Test" is special because it's part of the "Main" house, it's not a separate house.

        // Now, let's say you want to create a new "Test" room. But here's the problem: you're standing outside the "Main" house, and you just say, "Hey, I want a new 'Test' room." But Java doesn't know which "Main" house you're talking about because there could be many "Main" houses. It's like telling someone, "I want a room," without telling them which house you're in.
        
        // To solve this, you need to either:
        
        // Make the "Test" room separate from any particular "Main" house (by making it static). This means you can create a "Test" room from anywhere, without being inside any specific "Main" house.
        
        // Or, you need to say, "I want a new 'Test' room in this specific 'Main' house," by standing inside the "Main" house and then asking for a new "Test" room.


        // Test a = new Test("xyz");
        // Test b = new Test("abc");

        Test1 a1 = new Test1("pqr");
        Test1 b1 = new Test1("mno");
        System.out.println(a1.name1);
        System.out.println(b1.name1);
    }
}
