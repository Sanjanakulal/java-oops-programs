class Bank {
    private int balance = 0;

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Not enough balance");
        }
    }

    public int getBalance() {
        return balance;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Bank acc = new Bank();
        acc.deposit(1000);
        acc.withdraw(300);
        System.out.println("Balance left: " + acc.getBalance());
    }
}