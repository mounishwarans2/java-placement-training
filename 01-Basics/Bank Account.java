class BankAccount {
    private double balance;
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
        } 
        else {
            System.out.println("Insufficient balance");
        }
    }
    public double getBalance() {
        return balance;
    }
}
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(10000);
        System.out.println("Balance: " + account.getBalance());
        account.withdraw(3000);
        System.out.println("Balance: " + account.getBalance());
        account.withdraw(1000);
        System.out.println("Balance: " + account.getBalance());
    }
}
