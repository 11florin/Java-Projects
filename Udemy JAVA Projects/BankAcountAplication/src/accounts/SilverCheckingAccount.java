package accounts;

public class SilverCheckingAccount extends CheckingAccount {

    public SilverCheckingAccount(double balance, double interestRate, int rewardPoints) {
        super(balance, interestRate, rewardPoints);
        
    }

    @Override
    public int calculateRewardPoints(double cost) {
        // TODO Auto-generated method stub
        return (int) (cost * 25);
    }
    
}
