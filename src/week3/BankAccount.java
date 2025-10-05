package week3;

public class BankAccount {
    private String accountNumber ;
    private double balance;
    BankAccount(){
        accountNumber="unKnown";
        balance=0;
    }
    BankAccount(String accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void deposit(int amount){
        balance+=amount;
    }
    public void withDraw(int amount){
        if(balance>=amount){
            balance-=amount;
        }else {
            System.out.println("insufficient balance");
        }
    }
    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println();
    }

    public static void main(String[] args) {
        BankAccount b1=new BankAccount();
        BankAccount b2=new BankAccount("12345",1000);

        b1.displayAccount();

        b2.deposit(1000);
        b2.withDraw(1500);
        b2.displayAccount();
    }
}
