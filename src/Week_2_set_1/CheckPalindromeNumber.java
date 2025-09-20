package Week_2_set_1;

public class CheckPalindromeNumber {
    public static void main(String[] args) {
        int n = 1221 ;
        int temp = n;
        int reversed = 0 ;
        while (temp!=0){
            int lastDigit = temp%10;
            reversed=reversed*10+lastDigit;
            temp/=10;
        }
        if(n==reversed){
            System.out.println("it's palindrome");
        }else {
            System.out.println("it's not a palindrome");
        }

    }
}
