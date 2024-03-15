public class String1 {
    public static void main(String[] args) {
        String s = "Pranshu";
        s.concat("shah");
        System.out.println(s); // this will print Pranshu, because Strings are immutable, so we can not concat anything
    }
}
