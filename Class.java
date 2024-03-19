public class Class {
    static class Students{
        int rno;
        String name;
        float marks;

        // Students(int roll, String n, float m){
        //     rno = roll;
        //     name = n;
        //     marks = m;
        // }
        // once the code runs, this keyword is replaced with pranshu or rahul or anyone. ans, the values are assigned accordingly
        Students(int roll, String n, float m){
            this.rno = roll;
            this.name = n;
            this.marks = m;
        }
        Students(){
            this.rno = 3;
            this.name = "Siddh";
            this.marks = 45.7f;
        }
    }
    public static void main(String[] args) {
        Students pranshu = new Students(1, "pranshu", 98.4f);
        System.out.println(pranshu); // this will give some random output
        // by using . operator, we have to specify what data we want to print
        System.out.println("values passed in the constructor itself: ");
        System.out.println("roll no "+pranshu.rno);
        System.out.println("name "+pranshu.name);
        System.out.println("marks "+pranshu.marks);
        // if we want to assign any value to the properties of pranshu, use . operator
        pranshu.rno = 3;
        pranshu.name = "Pranshu";
        pranshu.marks = 90.4f;
        System.out.println("values assigned or allocated differently: ");
        System.out.println("roll no "+pranshu.rno);
        System.out.println("name "+pranshu.name);
        System.out.println("marks "+pranshu.marks);
        System.out.println("Rahul's data: ");
        Students rahul = new Students(2,"Rahul", 36.5f);
        System.out.println(rahul.rno);
        System.out.println(rahul.name);
        System.out.println(rahul.marks);

        // remember, if the values or not assigned independently in this main fucntion, it will by default take the values that were assigned in the constructor.
        // Now, how will it decide which function/constructor to choose? as all the constructors are named after the class name only?
        // so, the constructors can have same name, but the parameters should be different i.e. 1 parameter could  be passed, 2 parameters could be passed, 3 parameters could be passed and so on...
        Students siddh = new Students();
        System.out.println(siddh.rno);
        System.out.println(siddh.name);
        System.out.println(siddh.marks);
    }
}
