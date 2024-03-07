// refer immediate parent class instance variable
class Animal{
    String color = "White";
}
class Dog extends Animal{
    String color = "black";
    void printColor(){
        System.out.println(color);
        System.out.println(super.color); // prints color from parent class i.e. "white"
    }
}
public class Super1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printColor();
    }
}