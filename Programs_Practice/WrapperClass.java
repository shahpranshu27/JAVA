public class WrapperClass {
    static class A{
        String name;

        public A(String name){
            this.name = name;
        }
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        swap(a, b);
        System.out.println(a+" "+b);
        // wrapper class i.e. now, num = 12 is an object  
        Integer num = 12;
        Integer num1 = 14;
        swap(num, num1); // still won't swap because Integer is a 'final' class, so it's value once assigned, can't be changed
        System.out.println(num +" "+ num1);

        // final int c = 100;
        // c = 23; // we can not change the value of c variable, as it's value is finalised
        // always initialize while declaring it

        final A pranshu = new A("pranshu");
        System.out.println(pranshu.name);
        pranshu.name = "xyz";
        System.out.println(pranshu.name);

        // when a non primitive is final, you can not reassign it
        // pranshu = new A("Pqr"); 
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    static void swap(Integer a, Integer b){
        int temp = a;
        a = b;
        b = temp;
    }
}
