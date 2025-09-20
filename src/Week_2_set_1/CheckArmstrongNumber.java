package Week_2_set_1;

public class CheckArmstrongNumber {
    public static void main(String[] args) {
        int n = 153;
        int temp =n;
        int count = 0;
        while (temp!=0){
            temp = temp/10;
            count++;
        }
        temp=n;
        int sum = 0;
        while (temp!=0){
            int lastdigit = temp%10;
            sum+= (int) Math.pow(lastdigit,count);
            temp=temp/10;
        }
        if(n==sum){
            System.out.println("given num is an armstrong num");
        }
        else {
            System.out.println("its not an armstrong");
        }
    }
}
