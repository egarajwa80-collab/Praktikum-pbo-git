package id.ac.polinema;

public class Main {
    public static void main(String[] args) {
       Customer customer1 = new customer("Nadia", "0812-0000-0001");
       Account acc1 = new Account("A001", customer1, 500000);
       acc1.withdraw(150000);

       Customer customer2 = new customer("sari", "0812-0000-0002");
       Account acc2 = new Account("A002", customer2, 200000);

       Bank bank = new Bank(10);
       bank.addAccount(acc1);
       bank.addAccount(acc2);
       printAccountInfo();

       Account found = bank.findAccount("A002");
       if (found != null) {
        found.printInfo();

       }
  
    }
}
