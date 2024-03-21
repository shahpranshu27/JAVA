package staticExample;

// class Home{
//     static String name;
//     static String area;
//     static String city;
//     public Home(String name, String area, String city){
//         Home.name = name;
//         Home.area = area;
//         Home.city = city;
//     }
// }
class Home{
    String name;
    String area;
    String city;
    public Home(String name, String area, String city){
        this.name = name;
        this.area = area;
        this.city = city;
    }
}
public class House {
    // class Home{
    //     String name;
    //     String area;
    //     String city;
    //     public Home(String name, String area, String city){
    //         this.name = name;
    //         this.area = area;
    //         this.city = city;
    //     }
    // }
    public static void main(String[] args) {
        // House obj = new House();
        // Home obj1 = obj.new Home("a", "b", "c");
        // Home obj2 = obj.new Home("d", "e", "f");
        // System.out.println(obj1.name+" "+obj1.area+" "+obj1.city);
        // System.out.println(obj2.name+" "+obj2.area+" "+obj2.city);
        Home h1 = new Home("Shikhar", "Gurukul", "Ahmedabad");
        Home h2 = new Home("Sahjanand", "Memnagar", "Mumbai");
        Home h3 = new Home("Sthapatya", "Malegao", "Delhi");

        System.out.println(h1.name + " "+ h1.area +" "+ h1.city);
        System.out.println(h2.name + " "+ h2.area +" "+ h2.city);
        System.out.println(h3.name + " "+ h3.area +" "+ h3.city);
    }
}

// Package (staticExample):
// This line defines the package name for your code. It helps organize your classes and avoid naming conflicts with classes from other projects.

// Class (Home):
// This is a blueprint (class) for defining houses.
// It has three instance variables: name, area, and city. These variables will store information specific to each house (instance).
// The constructor Home(String name, String area, String city) allows you to create new houses by providing their details during creation.

// Instances (h1, h2, h3):
// In the main method, you create three instances of the Home class:
// Home h1 = new Home("Shikhar", "Gurukul", "Ahmedabad");: This creates a house named "Shikhar" in the "Gurukul" area of "Ahmedabad". h1 is the instance name for this specific house.
// You create two more houses (h2 and h3) with their own details using the constructor.

// Instance Variables and Printing:
// System.out.println(h1.name + " " + h1.area + " " + h1.city);: This line accesses the instance variables (name, area, and city) of the h1 instance and prints their values ("Shikhar", "Gurukul", and "Ahmedabad").
// Similarly, the following lines print the details of h2 and h3 using their respective instance variables.

// Key Points Illustrated:
// The Home class acts as a blueprint for creating individual houses (instances).
// Each instance (h1, h2, h3) has its own copy of instance variables, allowing them to store unique information.
// You can create multiple instances from the same class, representing different houses with their own details.

// Non-Static Members:
// In this example, all the members of the Home class (constructor, instance variables) are non-static. This means they are specific to each instance and require an object (instance) to be accessed.