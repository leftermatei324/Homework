package Homework3;

public class BankAccount {
    private String ownerName;
    private double balance;

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(String ownerName, double balance){
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount < 0){
            System.out.println("Invalid amount");
        }else {
            balance = balance + amount;
            System.out.println("Deposit " + amount);
            displaybalance();
        }


    }

    public void withdraw(double amount){
        if(balance >= amount && balance>0){
            balance = balance - amount;
            System.out.println("Withdraw: " + amount);
        }else {
            System.out.println("Invalid");
        }
        displaybalance();
    }

    public void displaybalance(){
        System.out.println("Balance: " + balance);
    }


    public static void main(String[] args) {
        CheckingAccount ca = new CheckingAccount("Matei", 500, 200);

        ca.deposit(-100);
        ca.deposit(500);
        ca.withdraw(700);
        ca.displaybalance();
        ca.withdraw(400);
    }
}
