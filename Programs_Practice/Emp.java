public class Emp {
    int id;
    String name;
    Address address;

    public Emp(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display(){
        System.out.println(id + " " + name);
        System.out.println(address.city+" "+address.state+" "+address.country);
    }

    public static void main(String[] args) {
        Address address1 = new Address("X", "Y", "Z");
        Address address2 = new Address("P","Q","R");

        Emp e1 = new Emp(1,"A",address1);
        Emp e2 = new Emp(2,"B",address2);

        e1.display();
        e2.display();
    }
}
