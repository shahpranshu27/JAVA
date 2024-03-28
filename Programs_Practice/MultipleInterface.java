interface Printable1{
    void print();
}
interface Showable1{
    void show();
}
class A implements Printable1, Showable1{
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