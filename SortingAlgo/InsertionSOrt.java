/**
 Insertion sort make two part one sorted nad second unsorted 
 unsorted se first elemnt lenge  aur usko utah ke shi position pe rkh denge 
 example :
 */

public class InsertionSOrt{
    public static void main(String[] args) {
        int[] arr = {4, 1, 7, 3, 9, 2, 0, 8};

        for (int i = 1; i < arr.length; i++) {
            int j = i;

            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }

        // 👉 Print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}