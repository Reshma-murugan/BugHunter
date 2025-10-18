package week5.BankTransactionSimulation;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(int amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            throw new InsufficientBalanceException("Deposit amount must be positive!");
        }
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited ₹" + amount + " | Balance: ₹" + balance);
    }

    public synchronized void withdraw(int amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            throw new InsufficientBalanceException("Withdrawal amount must be positive!");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance! Current balance: ₹" + balance);
        }
        balance -= amount;
        System.out.println(Thread.currentThread().getName() + " withdrew ₹" + amount + " | Balance: ₹" + balance);
    }

    public int getBalance() {
        return balance;
    }
}

class UserTransaction implements Runnable {
    private BankAccount account;

    public UserTransaction(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {  // each user performs 5 transactions
            int amount = (int) (Math.random() * 500) + 1;  // random 1–500
            boolean deposit = Math.random() < 0.5;         // random true/false

            try {
                if (deposit) {
                    account.deposit(amount);
                } else {
                    account.withdraw(amount);
                }
            } catch (InsufficientBalanceException e) {
                System.out.println(Thread.currentThread().getName() + ": " + e.getMessage());
            }

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);  // Start with ₹1000

        Thread user1 = new Thread(new UserTransaction(account), "User1");
        Thread user2 = new Thread(new UserTransaction(account), "User2");
        Thread user3 = new Thread(new UserTransaction(account), "User3");

        user1.start();
        user2.start();
        user3.start();

        try {
            user1.join();
            user2.join();
            user3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nFinal Balance: ₹" + account.getBalance());
    }
}
