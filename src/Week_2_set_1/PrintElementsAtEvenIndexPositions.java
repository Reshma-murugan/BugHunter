package Week_2_set_1;

public class PrintElementsAtEvenIndexPositions {
    public static void main(String[] args) {
       /* Print only the elements stored at even index positions in an array.
        int arr[] = {10, 20, 30, 40, 50, 60};
should print 10, 30, 50*/
        int[] arr = {10, 20, 30, 40, 50, 60 };
        for (int i = 0; i< arr.length; i++){
            if (i%2==0){
                System.out.print(arr[i]);
                if (i < arr.length - 2) { // avoid last comma
                    System.out.print(", ");
                }
            }
        }
    }
}
