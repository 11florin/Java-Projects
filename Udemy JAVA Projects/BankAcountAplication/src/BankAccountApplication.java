import java.util.ArrayList;

import accounts.*;

public class BankAccountApplication {
    public static void main(String[] args) {
        //polymorphism
        //Account account1 = new CheckingAccount(500, 0.025, 1000); //abstract
        CheckingAccount account2 = new GoldCheckingAccount(1000, 0.032, 2500);
        Account account3 = new SilverCheckingAccount(280, 0.029, 1770);

        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(new SilverCheckingAccount(450, 0.015, 957));
        accounts.add(new DiamondCheckingAccount(3200, 0.053, 19504));
        accounts.add(new SavingAccount(7241, 0.044));
        accounts.add(new GoldCheckingAccount(5527, 0.038, 4823));
        //accounts.add(new CheckingAccount(838, 0.026, 7339));//abstract
        accounts.add(new SavingAccount(992, 0.040));
        //accounts.add(new Account(340, 0.019));//abstract

        for (Account account : accounts) {
            account.status();
            System.out.println("------------");
        }
    }
}