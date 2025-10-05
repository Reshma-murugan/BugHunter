package week4.Interfaces.PaymentSystem;

interface Payment {
    void pay();
    void refund();
}
class CreditCardPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Paid using Credit Card");
    }

    @Override
    public void refund() {
        System.out.println("Refund processed to Credit Card");
    }
}

class UPIPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Paid using UPI");
    }

    @Override
    public void refund() {
        System.out.println("Refund processed via UPI");
    }
}

public class Main {
    public static void main(String[] args) {
        Payment[] payments={new CreditCardPayment(),new UPIPayment()};
        for (Payment p:payments){
            p.pay();
            p.refund();
            System.out.println("----------------");
        }
    }
}
