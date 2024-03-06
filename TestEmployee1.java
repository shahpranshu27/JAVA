class MyEmployee{
    private int id;
    private String name;
    // since id and name are private, they can't be accessed directly, so we will create methods to set and get the name and id of the employees

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void setId(int i){
        id = i;
    }

    public int getId(){
        return id;
    }
}
public class TestEmployee1 {
    public static void main(String[] args) {
        MyEmployee e1 = new MyEmployee();
        e1.setId(1);
        e1.setName("XX");
        System.out.println(e1.getId());
        System.out.println(e1.getName());
    }
}
