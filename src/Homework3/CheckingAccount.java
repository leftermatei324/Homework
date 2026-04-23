package Homework3;

public class CheckingAccount extends BankAccount{
    private double overDraftLimit;

    public CheckingAccount(String ownerName, double balance, double overDraftLimit){
        super(ownerName, balance);
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount < overDraftLimit){
            balance = balance - amount;
            System.out.println("Withdraw: " + amount + " (Allowed with overdraft)");
        }else {
            System.out.println("Withdraw: " + amount + " -> Exceeds overdraft limit");
        }

    }
}
