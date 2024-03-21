package Inheritence;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        System.out.println(box1.l +" "+ box1.w +" "+ box1.h);

        Box cube = new Box(5);
        System.out.println(cube.l+" "+cube.w+" "+cube.h);

        Box box2 = new Box(cube);
        System.out.println(box2.l +" "+ box2.w +" "+ box2.h);
    }
}
