import java.util.Scanner;

public class WeekdayAndWeekend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it's weekday or weekend: ");
        int n = sc.nextInt();

        switch (n) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday!! Himmat rakho");
                break;
            case 6:
            case 7:
                System.out.println("Weekend!! Chill time");
                break;
            default:
                break;
        }
        sc.close();
    }
}
