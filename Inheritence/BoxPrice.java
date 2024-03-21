package Inheritence;

public class BoxPrice extends BoxWeight {
    double price;
    public BoxPrice(double price){
        this.price = price;
    }

    public BoxPrice(double weight, double price){
        super(weight); // here, it will assume the BoxWeight(double weight) and whatever value we pass, it will take that value
        // super(); // if left empty, it will assume the BoxWeight() one, and will pass the default value that i have stored in this.weight = -1;
        this.price = price;
    }

    public BoxPrice(){
        super();
        this.price = -1; // by default value, if nothing is passed in the arguement
    }


    public BoxPrice(BoxWeight other, double price) {
        super(other);
        this.price = price;
    }

    public BoxPrice(double l, double w, double h, double weight, double price) {
        super(l, w, h, weight); // takes values of l, w, h, weight from BoxWeight
        this.price = price;
    }

    public BoxPrice(double side, double weight, double price){
        // created this function/method. this will call BoxWeight(side, weight) method
        super(side, weight);
        this.price = price;
    }



}
