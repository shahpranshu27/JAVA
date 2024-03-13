class Student5{
    int id;
    String name;
}
public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        // initialization through reference variable
        s1.id = 2;
        s1.name = "xyz";
        System.out.println(s1.id);
        System.out.println(s1.name);
    }    
}
