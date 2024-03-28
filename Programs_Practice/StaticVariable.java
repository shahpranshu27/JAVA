class Student1{
    int rollNo;
    String name;
    static String collegeName = "IIT";

    Student1(int r, String n){
        rollNo = r;
        name = n;
    }

    void display(){
        System.out.println(rollNo + "" + name + "" + collegeName);
    }
}
public class StaticVariable {
    public static void main(String[] args) {
        Student1 s1 = new Student1(1, "X");
        Student1 s2 = new Student1(2, "Y");
        s1.display();
        s2.display();
    }
}
