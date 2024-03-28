class Employee{
    int id;
    String name;
    float salary;
    void insert(int i, String n, float s){
        id=i;
        name=n;
        salary=s;
    }
    void display(){System.out.println(id+" "+name+" "+salary);}
}
public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.insert(1,"Yudhishtir", 2000);
        Employee e2 = new Employee();
        e2.insert(1,"Arjuna", 20000);
        Employee e3 = new Employee();
        e3.insert(1,"Bheema", 20001);
        Employee e4 = new Employee();
        e4.insert(1,"Nakul", 20002);
        Employee e5 = new Employee();
        e5.insert(1,"Sehdev", 20003);
        System.out.println("Id Name Salary");
        e1.display(); 
        e2.display(); 
        e3.display(); 
        e4.display(); 
        e5.display(); 
    }
}