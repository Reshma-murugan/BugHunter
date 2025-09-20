package week1_Optional;

public class ElectricityBillDiscount {
    public static void main(String[] args) {
        double eBill = 989;

        if (eBill > 1000) {
            eBill = eBill - (eBill * 10 / 100);
        } else if (eBill >= 500 && eBill <= 1000) {
            eBill = eBill - (eBill * 5 / 100);
        }

        System.out.println("Final electricity bill: ₹" + eBill);
    }
}
