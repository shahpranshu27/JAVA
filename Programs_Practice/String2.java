public class String2 {
    public static void main(String[] args) {
        String name = "Pranshu"; // name is reference variable, and "Pranshu" is the object or value. name = "Pranshu" means that name variable is currently pointing towards the object value "Pranshu"
        name = name.concat(" Shah"); // now, the new object is created i.e. "Pranshu Shah" and now, the reference variable name is pointing towards the object "Panshu Shah" instead of "Pranshu". "Pranshu" object is still there in the memory, but the reference variable is currently not pointing at it. 
        System.out.println("name: "+name);
        {
            name = "ramu"; // here, the object value was pointing at "Pranshu Shah", but now, the reference variable name is pointing to ward the new object value i.e. "ramu"  
            System.out.println(name);
        }
        // outside the block too, the reference varibale is currently pointing at the object value "ramu", so it will print ramu only
        System.out.println(name);
    }
}