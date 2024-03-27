public class Generic3 {
    static <T> void genericDisplay(T element){
        System.out.println(element.getClass().getName()+" = "+element);
    }
    // Generic function!
    public static void main(String[] args) {
        genericDisplay(11);

        genericDisplay("in vadiyon mein takra chuke hai....humse musafir yun to kahin.....");

        genericDisplay(345.455f);
    }
}
