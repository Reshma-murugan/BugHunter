package week1;

public class TheBankBalance {
    public static void main(String[] args) {
        int balance = 250;
        if(balance>0){
            System.out.println("Positive Balance");
        } else if (balance==0) {
            System.out.println("Zero Balance");
        }
        else {
            System.out.println("Overdraft");
        }
    }
}

