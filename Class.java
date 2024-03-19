public class Class {
    static class Students{
        int rno;
        String name;
        float marks;

        Students(int roll, String n, float m){
            rno = roll;
            name = n;
            marks = m;
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
    }
}
