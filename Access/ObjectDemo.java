package Access;

public class ObjectDemo {

    int num;
    float gpa;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }
    
    // we will go in details in hashmaps 
    @Override
    public int hashCode() {
        return super.hashCode(); // generates a random number based on the objects. it is not the address of the number, it's just a randomly generated number
        // return num;
    }


    @Override
    public boolean equals(Object obj) {
        // return super.equals(obj);
        return this.num == ((ObjectDemo)(obj)).num;
    }

    // already learnt toString() and finalize()
    @Override
    public String toString() {
        return super.toString();
    }

    // @Override
    // protected void finalize() throws Throwable {
    //     super.finalize();
    // }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(12, 56.7f);
        // System.out.println(obj.hashCode());
        ObjectDemo obj2 = new ObjectDemo(12, 67.5f);
        // System.out.println(obj2.hashCode());

        // == checks if obj1 and obj2 are pointing at the same thing or not
        // .equals() method checks every character by character

        // this is checking address of obj1 and obj2
        if(obj1 == obj2){
            System.out.println("obj1 obj2");
        }

        // this checks whether value is same or not
        if(obj1.equals(obj2)){
            System.out.println("obj1 equals obj2");
        }

        System.out.println(obj1.getClass()); // prints package in which it is + Class in which this object was made 
        // System.out.println(obj1.getClass());

        // else{
        //     System.out.println("bolo tara ra ra ");
        // }
    }
    
}
