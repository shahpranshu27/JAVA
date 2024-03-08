public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "Avengers - The Endgame";
        char ch = 'e';
        int freq = 0;
        for(int i=0; i<str.length(); i++){
            if(ch == str.charAt(i)){freq++;}
        }
        System.out.println("e appears : "+freq+" times");
    }    
}
