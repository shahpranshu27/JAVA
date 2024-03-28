public class SearchString {
    public static void main(String[] args) {
        String name = "Pranshu";
        char target = 'a';
        char target1 = 'e';
        boolean ans = search(name, target); // will return true, as 'a' is present in the string
        boolean ans1 = search(name, target1); // will return false, as 'e' is not present in the string
        System.out.println(ans);
        System.out.println(ans1);
    }

    public static boolean search(String str, char target){
        if(str.length() == 0){return false;}

        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){return true;}
        }
        return false;
    }
}