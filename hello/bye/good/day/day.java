package hello.bye.good.day;

import static trial.Sum2.greet;

public class day {
    public static void main(String[] args) {
        System.out.println("day.java in hello.bye.good.day package.folder");
        greet();
    }
    // the simple use case of package can be explained as, it is useful in managing the same named java files in different folders, who have different uses.
    // like for eg. sum1.java in b folder has different code, sum1.java in hello folder has different code/use, sum1.java in hello.bye folder has different use and so on. 
    // so, even though they have different uses, but same names, we can manage them by making different packages/folders
}
