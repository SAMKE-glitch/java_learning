public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + "deposited. New balance:" + balance);
    }

    // withdraw method
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + "withdrawn. New balance:" + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // display balance
    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance + " Please budge responsibly");
    }
}
