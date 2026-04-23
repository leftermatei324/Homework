package Homework3;

public class SavingsAccount extends BankAccount{
    private double interestRate;

    public void setInterestRate(double interestRate) {
        if(interestRate > 0 && interestRate < 1){
            this.interestRate = interestRate;
        }
    }



    public SavingsAccount(String ownerName, double balance, double interestRate){
        super(ownerName, balance);
        this.interestRate = interestRate;
    }

    public void addInterest(){
        double newBalance = getBalance() + getBalance() * interestRate;
        System.out.println("Interest added");
    }

}
