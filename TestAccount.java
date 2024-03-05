/* 
Java program to demonstrate the working of a banking system, where we deposit and wihdraw amount from our account. Creating an account class which has deposit() and wihdraw() methods
 */
class Account{
    int acc_no;
    String name;
    float amount;
    // method to initialize object
    void insert(int a, String n, float amt){
        acc_no = a;
        name = n;
        amount = amt;
    }

    // deposit amount method
    void deposit(float amt){
        amount+= amt;
        System.out.println("Amount deposited : "+amt);
    }

    // withdraw amount method
    void withdraw(float amt){
        if(amount<amt){
            System.out.println("Insufficient balance");
        }
        else{
            amount-= amt;
            System.out.println("Amount withdrawn : "+amt);
        }
    }

    // method to check current balance
    void checkBalance(){
        System.out.println("Your account has : "+amount);
    }

    // method to display values of an object
    void display(){System.out.println(acc_no+"     "+name+"   "+amount);}
}
public class TestAccount {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.insert(123, "mr. X", 120000);
        a1.checkBalance();
        System.out.println("AccNo   Name    Amount");
        a1.display();
        a1.deposit(100000);
        a1.checkBalance();
        a1.withdraw(20000);
        a1.checkBalance();
    }
}
