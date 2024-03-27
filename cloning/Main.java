package cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human pranshu = new Human(21, "pranshu");
        // Human twin = new Human(pranshu);
    
        Human twin = (Human)pranshu.clone();    
        // System.out.println(twin.age);
        // System.out.println(twin.name);
        System.out.println(Arrays.toString(twin.arr));

        // in shallow copy, the element will be changed i.e. in twin and in pranshu, element will be changed in both
        // in deep copy, the element changed will only happen in clone one, and not the real one i.e. in this case, element will be changed in twin, but not pranshu
        twin.arr[0] = 29;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(pranshu.arr));
    }
    

}
