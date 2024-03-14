public class MethodOverloading {
    public static void main(String[] args) {
        fun(2);
        fun("Mr. X");
    }
    // see, here there are 2 functions fun() with same name, but the parameters passed in those 2 methods are different. thus they can exist

    static void fun(int a){
        System.out.println(a);
    }
    // 2 methods with same name can not exist, unless the parameters passed in that are different
    static void fun(String name){
        System.out.println(name);
    }
}