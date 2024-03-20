package staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    public Human(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1; // here, even if we put this.population += 1; it will increase the value by 1 each and everytime new Human is created/instantiated, since it's static now, the new value will be stored everytime.
        // here, since we are using Human.population, it counts how many new Human examples are being created, and returns that value
    }
}
