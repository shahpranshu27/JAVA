package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            // int c = a/b;
            // divide(a, b); 
            // throw new Exception("fun");
            String name = "pranshu";
            if(name.equals("pranshu")){
                throw new MyException("name is pranshu");
            }
        } 
        catch (MyException e) {
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } 
        finally {
            System.out.println("this will always be executed");
        }
    }

    static int divide(int a, int b) throws  ArithmeticException{
        // return a/b;
        if(b == 0){
            throw new ArithmeticException("please don't divide by 0");
        }
        return a/b;
    }
}
