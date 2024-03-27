public class Vowels_Consonants {
    public static void main(String[] args) {
        int vowelsCnt = 0;
        int conCnt = 0;

        String str = "My name is Pranshu and I am an sde intern";

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){vowelsCnt+=1;}
            else if(str.charAt(i)>='a' && str.charAt(i)<='z'){conCnt+=1;}
        }

        System.out.println(vowelsCnt);
        System.out.println(conCnt);
    }
}
