class Student5{
    int roll;
    String name;
    String college = "IIT";

    void changeCollege(String s){
        college = s;
    }

    Student5(int r, String n){
        roll = r;
        name = n;
    }

    public void display(){
        System.out.println(roll+" "+name+" "+college);
    }
}
public class StaticVariable1 {
    public static void main(String[] args) {
        Student5 s3 = new Student5(1, "Modi");
        s3.display();
        s3.changeCollege("IIM");
        System.out.println(s3.name+" has changed the college, and new college is : "+s3.college);
        // s3.display();
    }
}
