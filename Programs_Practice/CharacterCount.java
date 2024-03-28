public class CharacterCount {
    public static void main(String[] args) {
        String str = "My name is Pranshu Shah";
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            cnt+=1;
        }
        System.out.println("total characters in string are: "+cnt);
    }
}
