package Week_2_set_1;

public class SecondLargestElementinArray {
    public static void main(String[] args) {
        int[] arr = {14, 28, 19, 33, 45, 12};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int n : arr){
            if(n>largest){
                secondLargest=largest;
                largest=n;
            } else if (n<largest && n>secondLargest) {
                secondLargest=n;
            }
        }
        System.out.println("secondLargest num = "+secondLargest);
    }
}
