package staticExample;

// import hello.bye.good.night.hello;

// import staticExample.Human;
public class Human11 {
    public static void main(String[] args) {
        Human pranshu = new Human(21,"Pranshu",0, false);
        Human siddh = new Human(23,"Siddh",0, true);
        Human yashvi = new Human(25,"Yashvi",0, true);
        Human siddhi = new Human(21,"Siddhi",0, true);
        // System.out.println(pranshu.age);
        // System.out.println(pranshu);
        // if population is not set to static, it will return 1 for everyone, as for each and every names, new Human is created, and thus, by default the value is 0
        // thus, we are assigning static to population, so that even though new Human is created everytime, the value of population is the new one.

        // NOTE: ALWAYS USE HUMAN OR ANY CLASS NAME ONLY
        // System.out.println(pranshu.population);
        // System.out.println(siddh.population);
        // System.out.println(yashvi.population);
        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population);
        // hello();
        // greet();
        hello();
        // Remember: static variables are not dependent on objects
    }

    // remember, we can not use non static method inside the static method. that is why, we can not use any non static method inside the main method  
    static void hello(){
        // System.out.println("heluu");
        // greeting();// will give error
        greet(); // this won't give error, as greet() is a static method, so we can use it in static method
    }

    static void greet(){
        // greeting(); // we can not use this because it requires an instance but the function we are using, it doesn't depend on the instance 

        // we can not access non static stuff without referencing their references in static context 

        // hence, here we are referencing it 
        Human11 obj = new Human11();
        obj.greeting();
        System.out.println("Hello");
        // System.out.println(this.name); // we can not use this inside the static method, as static doesn't need to create an object, and this is used with objects only 
    }

    void greeting(){
        Human11 obj1 = new Human11(); // obj1 object is created, and greet() and greeting() both the non static methods are accessed using this object only
        // obj1.greet();
        obj1.message();
        // obj1.greet(); // this will give warning because if the method is static, it should be accessed in static manner only
        System.out.println("hi");
        message(); // this also won't give error, as we can declare or use non static method in the non static method
    }

    // if there are many non static methods, we just need to create 1 object in any 1 non static method, and then rest of the non static methods can be accessed through that object only
    void message(){
        System.out.println("message");
        // greeting();
        // greet(); // we can use static methods inside the non static methods, but vice versa isn't true 
        // hello();
    }
}
