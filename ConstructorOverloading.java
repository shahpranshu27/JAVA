class Student2{
    int id;
    String name;
    int age;

    // creating 2 arguments constructor 
    Student2(int i, String n){
        id=i;
        name=n;
    }

    // creating 3 arguements constructor
    Student2(int i, String n, int a){
        id=i;
        name=n;
        age=a;
    }

    void display(){System.out.println(id+"  "+name+"    "+age);}
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        Student2 s1 = new Student2(1, "X");
        Student2 s2 = new Student2(2,"Y",23);
        s1.display();
        s2.display();
    }
}
