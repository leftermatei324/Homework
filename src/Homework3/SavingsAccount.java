package Homework3;

public class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(String ownerName, double balance, double interestRate){
        super(ownerName, balance);
        this.interestRate = interestRate;
    }

    public void addInterest(){
        balance = balance + balance * interestRate/100;
        System.out.println("Interest added");
    }

}
