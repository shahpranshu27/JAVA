import java.util.ArrayList;
// import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i+1);
        }

        // arr.forEach((item) -> System.out.println(item*2));

        // Consumer<Integer> fun = (item) -> System.out.println(item*2);
        // arr.forEach(fun);

        Operation sum = (a, b) -> a+b;
        Operation prod = (a, b) -> a*b;
        Operation sub = (a, b) -> a-b;

        LambdaFunctions myCalc = new LambdaFunctions();
        System.out.println(myCalc.operate(2, 3, sum));
        System.out.println(myCalc.operate(2, 3, prod));
        System.out.println(myCalc.operate(2, 3, sub));
    }

    // int sum(int a, int b){
    //     return a+b;
    // }

    private int operate(int a, int b, Operation op){
        return op.operation(a, b);
    }
}

interface Operation {
    int operation(int a, int b);
}