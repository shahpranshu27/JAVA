class Animal6{  
    void eat(){System.out.println("eating...");}  
    }  
    class Dog extends Animal6{  
    void eat(){System.out.println("eating bread...");}  
    }  
    class Cat extends Animal6{  
    void eat(){System.out.println("eating rat...");}  
    }  
    class Lion extends Animal6{  
    void eat(){System.out.println("eating meat...");}  
}  
class Polymorphism2{  
    public static void main(String[] args){  
    Animal6 a;  
    a=new Dog();  
    a.eat();  
    a=new Cat();  
    a.eat();  
    a=new Lion();  
    a.eat();  
    }
}