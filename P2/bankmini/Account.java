public class Account {
    public String ownerName;
    public double balance;

    public Account(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    
    public void deposit(double amount) {
        balance = balance + amount;
    }

    
    public void withdraw(double amount) {
        balance = balance - amount;
        if (isOverdrawn()) {
            balance = balance + amount; 
            System.out.println("Withdrawal rejected: insufficient balance.");
        }
    }

    public void printInfo() {
        System.out.println(ownerName + " - balance: " + balance);
    }

    
    public String formatBalance() {
        return String.format("%,.2f", balance);
    }

    public boolean isOverdrawn() {
        return balance < 0;
    }

  
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
        this.withdraw(amount);   
        target.deposit(amount);  
    }
}
