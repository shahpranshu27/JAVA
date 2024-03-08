interface Printable{
    void print();
}
interface Showable{
    void show();
}
class A implements Printable, Showable{
    public void print(){System.out.println("Printing");}
    public void show(){System.out.println("Showing");}
}
public class MultipleInterface {
    public static void main(String[] args) {
        A a = new A();
        a.print();
        a.show();
    }
}