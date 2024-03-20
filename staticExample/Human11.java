package staticExample;
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
        // Remember: static variables are not dependent on objects
    }

}
