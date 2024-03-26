public class Son extends Parent {

    public Son(int age){
        super(age);
        // this.age = age;
    }

    @Override
    void normal() {
        super.normal();
    }
    

    // @Override
    // void career(String name) {
    //     // throw new UnsupportedOperationException("Unimplemented method 'career'");
    //     System.out.println("I am gonna be a : "+name);
    // }

    // @Override
    // void partner(String name, int age) {
    //     // throw new UnsupportedOperationException("Unimplemented method 'partner'");
    //     System.out.println("I love "+name+" and her age is "+age);
    // }
    
    @Override
    void career() {
        // throw new UnsupportedOperationException("Unimplemented method 'career'");
        System.out.println("I am gonna be an engineer ");
    }

    @Override
    void partner() {
        // throw new UnsupportedOperationException("Unimplemented method 'partner'");
        System.out.println("I love Alia ");
        System.out.println("I love Alia "+age);
    }

    
}