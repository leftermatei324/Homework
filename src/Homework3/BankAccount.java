package Homework3;

public class BankAccount {
    String ownerName;
    double balance;

    public BankAccount(String ownerName, double balance){
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Deposit " + amount);
        displaybalance();

    }

    public void withdraw(double amount){
        if(balance >= amount){
            balance = balance - amount;
            System.out.println("Withdraw: " + amount);
        }else {
            System.out.println("Insufficient funds");
        }
        displaybalance();
    }

    public void displaybalance(){
        System.out.println("Balance: " + balance);
    }


    public static void main(String[] args) {
        System.out.println("Savings Account:");
        SavingsAccount sa = new SavingsAccount("Matei", 1000, 5);
        sa.displaybalance();
        sa.addInterest();
        sa.displaybalance();

        System.out.println("\nChecking Account:");
        CheckingAccount ca = new CheckingAccount("Matei", 500, 200);
        ca.displaybalance();
        ca.withdraw(600);
        ca.displaybalance();
        ca.withdraw(500);
    }
}
