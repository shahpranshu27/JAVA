package enumExample;

public class Basic {
    enum Week implements A{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // there are enum constants 
        // public, static & final
        // since it's final, you can create child enums  
        // type is week


        Week(){
            System.out.println("constructor called for : "+this.toString());
        }

        @Override
        public void hello() {
            System.out.println("hey!!");
        }

        // this is not public or protected, only private or default
        // why? because we don't want to create new objects 
        // this is not the enum concept, that's why 

        // interanlly: public static final Week Monday = new Week();
    }

    public static void main(String[] args) {
        Week week;
        // System.out.println(week);
        week = Week.Tuesday;

        week.hello();

        System.out.println(Week.valueOf("Monday"));

        // for (Week day : Week.values()) {
        //     System.out.println(day);
        // }

        // System.out.println(week.ordinal()); // ordinal prints the index of week.Monday or week.Tuesday or something
    }
}
