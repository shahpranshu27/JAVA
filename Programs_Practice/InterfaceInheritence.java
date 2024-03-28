interface Printable{
    void print();
}
interface Showable extends Printable{
    void show();
}
public class InterfaceInheritence implements Showable {
    public void print(){System.out.println("Printing");}
    public void show(){System.out.println("Showing");}

    public static void main(String[] args) {
        InterfaceInheritence i = new InterfaceInheritence();
        i.print();
        i.show();
    }
}
