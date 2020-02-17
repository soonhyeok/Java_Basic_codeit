public class BankDriver {
    public static void main(String[] args) {
     //    사람 1
     //   Person p1 = new Person();
     //   p1.setName("김신의");
     //   p1.setAge(28);
     //   p1.setCashAmount(30000);

        Person p1 = new Person("김신의", 28, 30000);

        // 은행 계좌 1
        BankAccount a1 = new BankAccount();
        a1.setBalance(100000);


        p1.setAccount(a1);
        a1.setOwner(p1);

        Person p2 = new Person("문종모", 25);
        System.out.println(p2.getName());
        System.out.println(p2.getCashAmount());

        BankAccount a2 = new BankAccount();
        a2.setBalance(50000);
    }
}