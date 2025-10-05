package week4.Abstraction.BankAccount;

abstract class BankAccount {
    double balance;
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
    void displayBalance() {
        System.out.println("("+getClass().getSimpleName()+") Current Balance: " + balance);
    }
}
class SavingsAccount extends BankAccount{

    @Override
    void deposit(double amount) {
        balance+=amount;
    }

    @Override
    void withdraw(double amount) {
        int minBalance=500;
        if((balance-amount)>=minBalance){
            balance-=amount;
        }else {
            System.out.println("inSufficient balance");
        }
    }
}
class CurrentAccount extends BankAccount{

    @Override
    void deposit(double amount) {
        balance+=amount;
    }

    @Override
    void withdraw(double amount) {
        int overDraftAmount=10000;
        if((balance-amount)<-overDraftAmount){
            System.out.println("overDraft Limit exceeded");
        }else {
            balance-=amount;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        SavingsAccount s1= new SavingsAccount();
        s1.deposit(1000);
        s1.withdraw(200);
        s1.displayBalance();
        CurrentAccount c1=new CurrentAccount();
        c1.withdraw(10000);
        c1.displayBalance();
    }
}
