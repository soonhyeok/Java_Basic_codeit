import java.util.ArrayList;

public class BankDriver {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        MinimumBalanceAccount mba = new MinimumBalanceAccount();
        SavingAccount sa = new SavingAccount();

        ArrayList<BankAccount> accounts = new ArrayList<>();

        accounts.add(ba);
        accounts.add(mba);
        accounts.add(sa);

        for(BankAccount account : accounts) {
            account.deposit(1000);
            if(account instanceof SavingAccount) {
                ((SavingAccount) account).addInterest();
            }
        }

        // BankAccount sa2 = new SavingAccount();
        // BankAccount sa3 = sa;

        // sa.addInterest();
        // ((SavingAccount) sa3).addInterest();
    }
}
