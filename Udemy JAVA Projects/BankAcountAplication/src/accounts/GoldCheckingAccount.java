package accounts;

public class GoldCheckingAccount extends CheckingAccount{

    public GoldCheckingAccount(double balance, double interestRate, int rewardPoints) {
        super(balance, interestRate, rewardPoints);
        //TODO Auto-generated constructor stub
        
    }

    @Override
    public int calculateRewardPoints(double cost) {
        // TODO Auto-generated method stub
        return (int) (Math.min(cost, 4000) * 50);
    }
    
}
