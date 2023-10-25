package Task10;
import java.util.Scanner;

public class BankAccountDesign {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private double minbalance;

    public BankAccountDesign(String accountNumber, String accountHolderName, double balance, double minbalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.minbalance = 1000;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("deposited: " + amount);
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance - amount >= minbalance) {
                balance = balance - amount;
                System.out.println("withdrawn amount is: " + amount);
            } else {
                System.out.println("insufficient balance to withdraw");
            }
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }

    public double getbalance() {
        return balance;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter Account holders name");
        String accountHolderName=sc.nextLine();
         

        BankAccountDesign acc1 = new BankAccountDesign("123", accountHolderName, 10000, 1000);
        BankAccountDesign acc2 = new BankAccountDesign("5678", "charan", 10, 100);
        System.out.println("initial balance");
        System.out.println("acc1 initial balance: " + acc1.getbalance());
        System.out.println("acc2 initial balance: " + acc2.getbalance());

        acc1.deposit(500);
        acc2.deposit(10);

        System.out.println("after deposit: ");

        System.out.println("acc1 balance: " + acc1.getbalance());
        System.out.println("acc2 balance: " + acc2.getbalance());
    

        acc1.withdraw(400.0);
        System.out.println(acc1.getbalance());


    sc.close();
    }
}
