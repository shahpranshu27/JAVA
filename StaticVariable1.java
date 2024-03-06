class Student4{
    int roll;
    String name;
    static String college = "IIT";

    static void changeCollege(String s){
        college = s;
    }

    Student4(int r, String n){
        roll = r;
        name = n;
    }

    public void display(){
        System.out.println(roll+" "+name+" "+college);
    }
}
public class StaticVariable1 {
    public static void main(String[] args) {
        Student4 s3 = new Student4(1, "Modi");
        s3.display();
        s3.changeCollege("IIM");
        System.out.println(s3.name+" has changed the college, and new college is : "+s3.college);
        // s3.display();
    }
}
