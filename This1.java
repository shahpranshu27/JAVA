class Student6{
    int rollno;
    String name, course;
    float fees;

    Student6(int rollno, String name, float fees){
        this.rollno = rollno;
        this.name = name;
        this.fees = fees;
    }

    Student6(int roll, String name, float fees, String course){
        this(roll, name, fees); // it is compulsory to use this() before assigning any other attribute. if this() is used afterwards, it will generate an error
        this.course = course;
    }

    void display(){
        System.out.println(rollno+" "+name+" "+course+" "+fees);
    }
}
public class This1 {
    public static void main(String[] args) {
        Student6 s6 = new Student6(1, "X", 1200000);    
        Student6 s7 = new Student6(2, "Y", 12000, "CE");
        s6.display();
        s7.display();
    }

}
