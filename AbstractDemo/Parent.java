public abstract class Parent {
    int age;

    
    public Parent(int age) {
        this.age = age;
    }

    // we can create static methods in abstract classes, but we can not create abstract static class becuase abstract is used for override, and static can not be overriden, so there's no point
    static void hello(){
        System.out.println("Hello!!");
    }

    void normal(){
        System.out.println("I am a normal method");
    }

    // abstract Parent(); // we can not create abstract constructors

    // remember: if there's a method which is abstract, then the class should also be abstract
    // abstract void career(String name);    
    // abstract void partner(String name, int age);
    abstract void career();
    abstract void partner();
}
