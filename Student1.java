public class Student1 {
    private int roll;
    private String name;
    public int getRoll(){ //accessor method
        return roll;
    } 
    public void setRoll(int roll){
        this.roll = roll;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void display(){
        System.out.println("Roll No. : "+roll);
        System.out.println("Name : "+name);
    }
}
