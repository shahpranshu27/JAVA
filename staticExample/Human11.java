package staticExample;

import hello.bye.good.night.hello;

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
        hello();
        greet();
        // Remember: static variables are not dependent on objects
    }

    // remember, we can not use non static method inside the static method. that is why, we can not use any non static method inside the main method  
    static void hello(){
        // System.out.println("heluu");
        // greeting();// will give error
        greet(); // this won't give error, as greet() is a static method, so we can use it in static method
    }

    static void greet(){
        System.out.println("Hello");
    }

    void greeting(){
        System.out.println("hi");
        message(); // this also won't give error, as we can declare or use non static method in the non static method
    }

    void message(){
        System.out.println("message");
        greeting();
        greet(); // we can use static methods inside the non static methods, but vice versa isn't true 
        hello();
    }
}
