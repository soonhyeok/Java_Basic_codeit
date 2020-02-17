public class BankAccount {
    private int balance;
    private Person owner;

    public void setBalance(int pBalance) {
        balance = pBalance;
    }

    public int getBalance() {
        return balance;
    }

    public void setOwner(Person pOwner) {
        owner = pOwner;
    }

    public Person getOwner() {
        return owner;
    }

    public BankAccount(int pBalance) {
        if (pBalance < 0) {
            balance = 0;
        } else {
            balance = pBalance;
        }
    }

    public BankAccount(Person pOwner) {
        owner = pOwner;
        balance = 0;
    }

    public BankAccount(int pBalance, Person pOwner) {
        owner = pOwner;
        balance = pBalance;
    }

    // 파라미터 : 입금할 액수 (정수)
    // 리턴 : 성공여부 (불린)
    boolean deposit(int amount) {
        if(amount < 0 || owner.getCashAmount() < amount) {
            System.out.println("입금 실패입니다. 잔고: " + getBalance() + "원, 현금: " + owner.getCashAmount() + "원");
            System.out.println("false");
            return false;

        } else {
            balance += amount;
            owner.setCashAmount(owner.getCashAmount() - amount);
            System.out.println(amount + "원 입금하였습니다. 잔고: " + getBalance() + "원, 현금: " + owner.getCashAmount() + "원");
            System.out.println("true");
            return true;
        }

    }


    // 파라미터 : 출금할 액수 (정수)
    // 리턴 : 성공여부 (불린)
    boolean withdraw(int amount) {
        if(amount < 0 || getBalance() < amount) {

            System.out.println("출금 실패입니다. 잔고: " + balance + "원, 현금 : " + owner.getCashAmount() + "원");
            System.out.println("false");
            return false;
        } else {

            balance -= amount;
            owner.setCashAmount(owner.getCashAmount() + amount);
            System.out.println(amount + "원 출금하였습니다. 잔고: " + balance +"원, 현금: " + owner.getCashAmount() + "원");
            System.out.println("true");
            return true;
        }

    }

    // 첫 번째 파라미터: 받는 사람 (Person)
    // 두 번째 파라미터: 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)
    public boolean transfer(BankAccount to, int amount) {
        boolean success;

        if (amount < 0 || amount > balance) {
            success = false;
        } else {
            balance -= amount;
            to.balance += amount;
            success =true;
        }
        System.out.println(success + " - from: " + owner.getName() + ", to: " + to.owner.getName() + ", amount: " + amount + ", balance: " + balance);

        return success;
    }

    // 첫 번째 파라미터: 받는 사람의 계정 (BankAccount)
    // 두 번째 파라미터: 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)
    public boolean transfer(Person to, int amount) {
        return transfer(to.getAccount(), amount);
    }
}

