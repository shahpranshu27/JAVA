package comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student pranshu = new Student(12,97.56f);
        Student siddh = new Student(83,92.56f);
        Student yashvi = new Student(24,57.56f);
        Student arjun = new Student(51,89.56f);
        Student sehdev = new Student(64,50.56f);

        Student[] list = {pranshu, siddh, yashvi, arjun, sehdev};

        System.out.println(Arrays.toString(list));
        Arrays.sort(list); // sorts based n the compareTo() method
        // if i compare this.marks - o.marks -> it will sort according to marks
        // if i compare this.rollno - o.rollno -> it will sort according to rollno
        System.out.println(Arrays.toString(list));

        // if(pranshu.compareTo(siddh) > 0){
        //     System.out.println("pranshu has more marks");
        // }
        // else if(pranshu.compareTo(siddh) == 0){System.out.println("same marks");}
        // else{System.out.println("siddh has more marks!");}

    }
}
