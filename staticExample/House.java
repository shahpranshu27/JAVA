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
