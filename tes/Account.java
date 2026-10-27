package id.ac.polinema;

public class Account {
    public String ownerName;
    public double balance;

    // Langkah 4: konstruktor
    public Account(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    // Langkah 3
    public void deposit(double amount) {
        balance = balance + amount;
    }

    // Langkah 5: withdraw memakai isOverdrawn()
    public void withdraw(double amount) {
        balance = balance - amount;
        if (isOverdrawn()) {
            balance = balance + amount; // batalkan pengurangan
            System.out.println("Withdrawal rejected: insufficient balance.");
        }
    }

    public void printInfo() {
        System.out.println(ownerName + " - balance: " + balance);
    }

    // Langkah 5
    public String formatBalance() {
        return String.format("%,.2f", balance);
    }

    public boolean isOverdrawn() {
        return balance < 0;
    }

    // Tugas mandiri: transfer saldo ke rekening lain
    public void transferTo(Account target, double amount) {
        if (target == null) {
            System.out.println("Transfer rejected: target account is null.");
            return;
        }
        if (amount <= 0) {
            System.out.println("Transfer rejected: amount must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.println("Transfer rejected: insufficient balance.");
            return;
        }
        this.withdraw(amount);   // kurangi saldo pengirim
        target.deposit(amount);  // tambah saldo penerima
    }
}
