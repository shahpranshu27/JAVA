class Student5{
    int id;
    String name;
}
public class TestStudent {
    public static void main(String[] args) {
        Student5 s1 = new Student5();
        // initialization through reference variable
        s1.id = 2;
        s1.name = "xyz";
        System.out.println(s1.id);
        System.out.println(s1.name);
    }    
}
