public class Main {
    public static void main(String[] args) {
        // creating an account
        BankAccount account = new BankAccount("1232322", "samuel", 1000);

        // performing transactions
        account.deposit(500);
        account.withdraw(1000);
        account.displayBalance();
    }
}