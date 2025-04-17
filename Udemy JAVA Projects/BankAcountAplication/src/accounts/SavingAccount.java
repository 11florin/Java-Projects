package accounts;

public class SavingAccount extends Account{

    public SavingAccount(double balance, double interestRate) {
        super(balance, interestRate);
        
    }
    public boolean withdraw(double amount) {
        double fee = 0.025 * amount;
        amount += fee;

        
        // if (amount > balance) {
        //     return false;
        // }
        // balance -= amount;
        // return true;
        //replace with super

        return super.withdraw(amount);
    }
    @Override
    public void deposit(double amount) {
        // TODO Auto-generated method stub
        super.deposit(amount);
    }
    @Override
    public void status() {
        // TODO Auto-generated method stub

        System.out.printf("Saving Account [Balance %.2f | Interest rate: %.2f]\n", balance, interestRate);
    }

}
