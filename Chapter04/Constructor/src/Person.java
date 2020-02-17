public class Person {
    private String name;
    private int age;
    private int cashAmount;
    private BankAccount account;

    public Person(String pName, int pAge, int pCashAmount) {
        name = pName;
        age = pAge;
        cashAmount = pCashAmount;
    }

    public Person(String pName, int pAge) {
        name = pName;
        age = pAge;
        cashAmount = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String pName) {
        name = pName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int pAge) {
        age = pAge;
    }

    public int getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(int pCashAmount) {
        cashAmount = pCashAmount;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setAccount(BankAccount pAccount) {
        account = pAccount;
    }
}
