public class Daughter extends Parent {

    public Daughter(int age){
        super(age);
        // this.age = age;
    }

    // @Override
    // void career(String name) {
    //     // throw new UnsupportedOperationException("Unimplemented method 'career'");
    //     System.out.println("I am gonna be a : "+name);
    // }

    // @Override
    // void partner(String name, int age) {
    //     // throw new UnsupportedOperationException("Unimplemented method 'partner'");
    //     System.out.println("I love "+name+" and his age is "+age);
    // }

    @Override
    void career() {
        // throw new UnsupportedOperationException("Unimplemented method 'career'");
        System.out.println("I am gonna be a doctor ");
    }

    @Override
    void partner() {
        // throw new UnsupportedOperationException("Unimplemented method 'partner'");
        System.out.println("I love Rohan");
    }
    
}