package Inheritence;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight(){
        this.weight = -1;
    }

    public BoxWeight(double l, double w, double h, double weight){
        super(l, w, h); // what is super()? it calls the parent class constructor i.e. in this case, it calls and takes values of l, w, h from the Box.java and takes weight from here
        // used to initialize the values present in parent class
        // if the parent class is declared public, then only it will be able to use the super() class, else, we won't be able to use it
        this.weight = weight;

    }
}
