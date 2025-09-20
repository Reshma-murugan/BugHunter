package Week_2_set_1;

public class ArrayElementFrequency {
    public static void main(String[] args) {
        int[] arr = {2, 4, 2, 6, 2, 9, 6};
        boolean[] visited = new boolean[arr.length]; // track visited elements

        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue; // skip already counted element

            int count = 1; // start with 1 (current element)
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true; // mark as counted
                }
            }
            System.out.println(arr[i] + " appears " + count + " times");
        }
    }
}
