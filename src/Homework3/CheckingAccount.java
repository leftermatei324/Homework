package Homework3;

public class CheckingAccount extends BankAccount{
    private double overDraftLimit;

    public void setOverDraftLimit(double overDraftLimit) {
        if(overDraftLimit >= 0){
            this.overDraftLimit = overDraftLimit;
        }

    }
    public CheckingAccount(String ownerName, double balance, double overDraftLimit){
        super(ownerName, balance);
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if(amount <= 0){
            System.out.println("Withdraw: " + amount + " -> Invalid amount");
            return;
        }

        if(getBalance() + overDraftLimit >= amount){
            setBalance(getBalance() - amount);
            System.out.println("Withdraw: " + amount + " (Allowed with overdraft)");
        } else {
            System.out.println("Withdraw: " + amount + " -> Exceeds overdraft limit");
        }
    }
}
