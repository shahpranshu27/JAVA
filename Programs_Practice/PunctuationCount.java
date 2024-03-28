public class PunctuationCount {
    public static void main(String[] args) {
        int cnt = 0;
        String str = "As I was saying, 'Java is the best, you can't deny that';";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='!' || str.charAt(i)==';' || str.charAt(i)==',' || str.charAt(i)==':' || str.charAt(i)=='.' || str.charAt(i)=='?' || str.charAt(i)=='-' || str.charAt(i)=='_' || str.charAt(i)=='/' || str.charAt(i)=='\'' ){
                cnt++;
            }
        }
        System.out.println("total punctuations in string are: "+cnt);
    }
}