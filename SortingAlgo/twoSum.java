import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {
        int arr[] = {13, 32, 2, 3, 1, 5};
        int target = 8;

        int n = arr.length;
        Arrays.sort(arr);

        int i = 0;
        int j = n - 1;

        while (i < j) {
            if (arr[i] + arr[j] == target) {
                System.out.println("Target found: " + arr[i] + " + " + arr[j]);
                break; // stop after finding
            } 
            else if (arr[i] + arr[j] > target) {
                j--;
            } 
            else {
                i++;
            }
        }

        if (i >= j) {
            System.out.println("Target not found");
        }
    }
}