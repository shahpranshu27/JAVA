import java.util.ArrayList;
import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);

        Scanner sc = new Scanner(System.in);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);
        list.set(0, 11);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

        for(int i=0; i<5; i++){
            list.add(sc.nextInt());
        }

        // System.out.println(list);

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i)); // pass indices here, list[index] will not work here
        }
        sc.close();
    }
}
