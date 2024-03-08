public class ReverseString {
    public static void main(String[] args) {
        String str = "Today is Friday";
        String reversed = reverse(str);
        System.out.println("Reversed string is: "+reversed);
    }

    public static String reverse(String str){
        if(str.isEmpty()){
            return str;
        }
        return reverse(str.substring(1))+str.charAt(0);
    }
}
