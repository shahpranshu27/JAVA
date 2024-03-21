package Inheritence;

public class Box {
    double l;
    double h;
    double w;

    Box(){
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    // cube
    Box(double side){
        this.l = side;
        this.w = side;
        this.h = side;
    }

    // cuboid
    Box(double l, double w, double h){
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(Box old){
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }

    public void info(){
        System.out.println("running the box!");
    }
}
