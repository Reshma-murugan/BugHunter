package Week_2_set_1;

public class ReverseNumberUsingWhileLoop {
    public static void main(String[] args) {
        int n = 12345;
        int reversed = 0;
        while (n!=0){
            int lastDigit = n%10;
            reversed = reversed*10+lastDigit;
            n=n/10;//remove last digit
        }
        System.out.println(reversed);
    }
}
