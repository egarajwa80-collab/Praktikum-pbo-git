package id.ac.polinema;

public class Main {
    public static void main(String[] args) {
        Account Limited = new Account ("Fajar", 1000000, 200000);
        System.out.println("Withdraw 300000 allowed?" + Limited.withdraw(300000));
        System.out.println("Withdraw 150000 allowed?" + Limited.withdraw(150000));
        Limited.printInfo();
    }
}
