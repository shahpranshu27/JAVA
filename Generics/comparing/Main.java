package comparing;

public class Main {
    public static void main(String[] args) {
        Student pranshu = new Student(2,97.56f);
        Student siddh = new Student(3,97.56f);

        if(pranshu.compareTo(siddh) > 0){
            System.out.println("pranshu has more marks");
        }
        else if(pranshu.compareTo(siddh) == 0){System.out.println("same marks");}
        else{System.out.println("siddh has more marks!");}

    }
}
