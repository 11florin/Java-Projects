package accounts;

public abstract class CheckingAccount extends Account {
    public int rewardPoints;

    public CheckingAccount(double balance, double interestRate, int rewardPoints) {
        super(balance, interestRate);
        this.rewardPoints = rewardPoints;
    }
    public boolean purchase(double cost) {
        if (cost > balance){
            return false;
        }
        balance -= cost;
        rewardPoints += calculateRewardPoints(cost);
        return true;
    }
    public abstract int calculateRewardPoints(double cost);
    // {
    //     return (int) (cost * 10); //abstract class can only have the header not body
    // }
    public int getRewardPoints() {
        return rewardPoints;
    }
    @Override
    public void status() {
        // TODO Auto-generated method stub
        System.out.printf("Checking Account\n");
        System.out.printf("\tBalance: %.2f\n", balance);
        System.out.printf("\tReward points: %d\n", rewardPoints);
    }
    
    
}

