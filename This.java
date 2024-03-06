class Student5{
    int id;
    String name;
    float fees;

    Student5(int id, String name, float fees){
        // id = id;
        // name = name;
        // fees = fees;
        // above statements would give null values, as the name of the attributes, and those passed as parameters are same. so it's difficult for machine to detect and differentiate.
        
        this.id = id;
        this.name = name;
        this.fees = fees;
    }

    void display(){
        System.out.println(id+" "+name+" "+fees);
    }
}
public class This {
    public static void main(String[] args) {
        Student5 s4 = new Student5(1, "X", 20000);
        s4.display();
    }
}
