package collections;

// import java.util.ArrayList;
// import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        List<Integer> list1 = new LinkedList<>();
        // List<Integer> list2 = new ArrayList<>();
        
        list1.add(34);
        list1.add(23);
        list1.add(12);
        list1.add(98);
        list1.add(56);
        // System.out.println(list1);

        List<Integer> vector= new Vector<>();
        vector.add(23);
        vector.add(12);
        vector.add(123);
        vector.add(2433);
        System.out.println(vector);
    }
}