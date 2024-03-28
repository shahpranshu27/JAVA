import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter empId : ");
        int empId = sc.nextInt();

        switch (empId) {
            case 1:
                System.out.println("Employee 1");
                System.out.println("Pranshu shah");
                break;
            case 2:
                System.out.println("Employee 2");
                System.out.println("Virat kohli");
                break;
            case 3:
                // System.out.println("Employee 3");
                System.out.println("Enter department: ");
                String dept = sc.next();
                switch (dept) {
                    case "IT":
                        System.out.println("Employee 3 is in IT department");
                        break;
                    case "Finance":
                        System.out.println("Employee 3 is in Finance department");
                        break;
                
                    default:
                    System.out.println("No dept found!");
                        break;
                }
                break;
            default:
            System.out.println("No employee found!");
                break;
        }
        sc.close();
    }
}
