public class Dog {
    String name;
    String breed;
    int age;
    String color;

    public Dog(String name, String breed, int age, String color){
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
    }

    public String getName(){return name;}

    public String getBreed(){return breed;}

    public int getAge(){return age;}

    public String getColor(){return color;}

    public String toString(){
        return ("hi, my name is "+this.getName()+" and my age, breed, color is : "+this.getAge()+" "+this.getBreed()+" "+this.getColor());
    }

    public static void main(String[] args) {
        Dog dabangg = new Dog("Dabangg", "Doberman", 5, "Black");

        System.out.println(dabangg.toString());
    }
}