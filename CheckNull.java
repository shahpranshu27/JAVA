public class CheckNull {
    public static void main(String[] args) {
        String str1 = null;
        String str2 = "";
        String str3 = " ";

        System.out.println("str1 is: "+isNull(str1));
        System.out.println("str2 is: "+isNull(str2));
        System.out.println("str3 is: "+isNull(str3));

    }
    public static String isNull(String str){
        if(str == null){return "Null";}
        else if(str.isEmpty()){return "Empty";}
        else{return "Neither null nor empty";}
    }
}