public class StringExample {
    public static void main(String[] args) {
        System.out.println(greet());
    }

    static String greet(){
        return "Hi Pranshu";
        // return 21; // it will give an error, as you can only retrun String, not an int, float or anything
    }
}