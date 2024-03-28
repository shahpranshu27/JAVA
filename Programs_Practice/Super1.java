// refer immediate parent class instance variable
class Animal2{
    String color = "White";
}
class Dog1 extends Animal2{
    String color = "black";
    void printColor(){
        System.out.println(color);
        System.out.println(super.color); // prints color from parent class i.e. "white"
    }
}
public class Super1 {
    public static void main(String[] args) {
        Dog1 d = new Dog1();
        d.printColor();
    }
}