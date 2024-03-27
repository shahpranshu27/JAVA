package cloning;

public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;

    // public Human(Human other){
    //     this.age = other.age;
    //     this.name = other.name;
    // }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        // this.arr = new int[5];
        this.arr = new int[] {1,3,4,2,5};
    }
    
    public Object clone() throws CloneNotSupportedException{
        // this is shallow copy
        // return super.clone();

        // this is deep copy
        Human twin = (Human)super.clone(); // this is actually shallow copy

        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        // here, we are copying all the elements from the twin array to original array i.e. pranshu, so the element won't be changed in pranshu, but it will be changed in twin
        return twin;
    }
}
