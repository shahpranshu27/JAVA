package Access;

public class A {
    protected int num;
    String name;
    int[] arr;

    
    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
    


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    // public String getName() {
    //     return name;
    // }

    // public int[] getArr() {
    //     return arr;
    // }

    // public void setName(String name) {
    //     this.name = name;
    // }



    // public void setArr(int[] arr) {
    //     this.arr = arr;
    // }
    
}
