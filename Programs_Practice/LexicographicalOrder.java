public class LexicographicalOrder {
    public static void main(String[] args) {
        String[] words = {"Ruby","C","Python","Java","Spring"};
        // System.out.println(words.length);
        for(int i=0; i<words.length; i++){
            for(int j=i; j<words.length; j++){
                if(words[i].compareTo(words[j])>0){
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        System.out.println("In lexicographical order: ");
        for(int i=0; i<words.length; i++){
            System.out.println(words[i]);
        }
    }
}