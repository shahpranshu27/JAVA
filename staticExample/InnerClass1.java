package staticExample;

class Test2{
    static String name2; // here, name2 is static variable, so it updates the name everytime the new object is instantiated

    public Test2(String name2){
        Test2.name2 = name2;
    }
}
public class InnerClass1 {
    public static void main(String[] args) {
        Test2 a2 = new Test2("null1");
        Test2 b2 = new Test2("null2");
        Test2 c2 = new Test2("null3");

        // here, noth the outputs will be null2 null2 as name2 is static, so is common among both the Test2 objects as b2 was made later

        // how is code executed
        // 1. Creating Object a2:
        // Test2 a2 = new Test2("null1");
        // The constructor is called, setting Test2.name2 to "null1".

        // 2. Creating Object b2:
        // Test2 b2 = new Test2("null2");
        // The constructor is called again, overriding the previous value of Test2.name2 and setting it to "null2".

        // Regardless of which object you use to access it, both a2.name2 and b2.name2 refer to the same static variable Test2.name2, which now holds the value "null2".

        System.out.println(a2.name2);
        System.out.println(b2.name2);

        // if and object c2 was created later on, the value passed in the new object will be static among the whole main lcass, and thus a2, b2, c2 all will give only null3 
        System.out.println(c2.name2);

        // here, d2 object was made after a2, b2, c2 were printed,  so the values won't change. but, after d2 was made, if we print a2, b2, and c2, all will return null4 only
        Test2 d2 = new Test2("null4");
        System.out.println(d2.name2);
        System.out.println(a2.name2 +" "+b2.name2+" "+c2.name2);
    }
}
