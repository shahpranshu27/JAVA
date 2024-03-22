package trial;

// import static hello.Sum1.text;
// import static hello.bye.Sum1.message;

public class Sum2 {
    public static void main(String[] args) {
        System.out.println("Sum2 in b folder");
        // message();
        // text();
        hello.Sum1.text();
    }

    public static void greet(){
        System.out.println("Greetings from b package!");
    }
}
