class Animal6{  
    void eat(){System.out.println("eating...");}  
    }  
    class Dog3 extends Animal6{  
    void eat(){System.out.println("eating bread...");}  
    }  
    class Cat3 extends Animal6{  
    void eat(){System.out.println("eating rat...");}  
    }  
    class Lion3 extends Animal6{  
    void eat(){System.out.println("eating meat...");}  
}  
class Polymorphism2{  
    public static void main(String[] args){  
    Animal6 a;  
    a=new Dog3();  
    a.eat();  
    a=new Cat3();  
    a.eat();  
    a=new Lion3();  
    a.eat();  
    }
}