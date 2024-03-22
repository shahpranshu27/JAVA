package Access;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10,"null");
        System.out.println(obj.num);
        // need to do few things: 
        // 1. access the data members
        // 2. modify the data members

        // obj.num(); // we can not access the num variable, as it is private

        // obj.getNum(); // so the question comes, if num is private, how can we access the getNum() method?
        // so, we can use num in the whole A.java file and it can be accessed throughout the file, and since getNum() and setNum() are public methods, we can access the num via getters and setters
        // System.out.println(obj.getNum());

        // obj.setNum(12); // so, the same logic that was used for getNum(), can be applied in the setNum() method too
        // System.out.println(obj.getNum());

        // private: it can be accessed only in that particular file that it was declared i
        // public: it can be accessed in whichever file and in whichever package we want
        // default: it is being declared by default, and it can only be accessed in the particular package that file is in.
        //  eg: if there's a package called pranshu.files and in that package, there are 2 files abc.java and def.java, now if any variable or method is default, then it can only be accessed in pranshu.files package within the 2 files (or more if more than 2 are created), but it won't be accessible from other package
        // protected:  

        // IMPORTANT :
        // when to use which access modifier?
        // private: for sensitive data. it can be accessed via methods that can be public, like getters and setters
        // default: it can be used when we want everything that can be acessed in the same package
        // protected: it should be used when we want to work in a different package, but only as a subclass of this particular class 
        // either subclass in different package, or subclass of subclass in a different package 
        // public: when we want it to be accessible everywhere
    }
}
