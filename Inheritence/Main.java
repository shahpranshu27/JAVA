package Inheritence;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        // System.out.println(box1.l +" "+ box1.w +" "+ box1.h);

        Box cube = new Box(5);
        // System.out.println(cube.l+" "+cube.w+" "+cube.h);

        Box box2 = new Box(cube);
        // System.out.println(box2.l +" "+ box2.w +" "+ box2.h);

        BoxWeight box3 = new BoxWeight();
        // System.out.println(box3.l+" "+box3.w+" "+box3.w+" "+box3.weight); 

        BoxWeight box4 = new BoxWeight(1, 2, 3, 4);
        // System.out.println(box4.l+" "+box4.w+" "+box4.h+" "+box4.weight);

        // there are many variables in both parent and child
        // you are given access to variables that are in reference type i.e. BoxWeight, hence you should have access to weight variable
        // this also means that ones you are trying to access should be initialised
        // but here, when the object itself is of type parent class, how will we call the constructor of child class
        // parent class know what classes are below it i.e. about the child classes
        // but, the child class doesn't know about the parent class 
        // we can not have child reference varibale, and a parent object
        // thus, this will give and error
        // BoxWeight box5 = new Box(1, 2, 3);


        // we can access the child class object throghht parent class reference variable, but then here, we will not be able to access weight as the reference variable has only l,w,h and not weight 
        // Box box6 = new BoxWeight(0, 0, 0, 0);
        // System.out.println(box6.weight);

        // BoxPrice box7 = new BoxPrice(2, 4);
        // System.out.println(box7.weight+" "+box7.price);

        // BoxPrice box8 = new BoxPrice();
        // System.out.println(box8.weight+" "+box8.price); // it will print -1.0 -1.0 as we have not passed any arguement in the object, it will take the default value which are -1 and -1 for both 

        BoxPrice box9 = new BoxPrice(box4, 10);
        // System.out.println(box9.h + " "+box9.price);

        BoxPrice box10 = new BoxPrice(1, 2, 3, 4, 5);
        // System.out.println(box10.l+" "+box10.weight+" "+box10.price);

        BoxPrice box11 = new BoxPrice(2, 4, 100);
        System.out.println(box11.l+" "+box11.weight+" "+box11.price);

    }
}
