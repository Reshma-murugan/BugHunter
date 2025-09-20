package Week_2_set_1;

public class CountPositiveNegativeZero {
    public static void main(String[] args) {
        int[] arr = {5, -3, 0, 12, -9, 0, 7};
        int positiveCount = 0 , negetiveCount = 0 , zeroCount = 0;

        for(int n : arr){
            if(n>0){
                positiveCount++;
            }
            else if(n<0){
                negetiveCount++;
            }else {
                zeroCount++;
            }
        }
        System.out.println("positive count = "+positiveCount+" , negetive count = "+negetiveCount+" , zerocount = "+zeroCount);
    }
}
