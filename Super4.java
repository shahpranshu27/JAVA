class Person1{
    int id;
    String name;
    Person1(int id, String name){
        this.id = id;
        this.name = name;
    }
}
class Emp extends Person1{
    float salary;
    Emp(int id, String name, float salary){
        super(id, name);
        this.salary = salary;
    }

    void display(){
        System.out.println(id+" "+name+" "+salary);
    }
}
public class Super4 {
    public static void main(String[] args) {
        Emp e1 = new Emp(1,"X",12345);
        e1.display();
    }
}