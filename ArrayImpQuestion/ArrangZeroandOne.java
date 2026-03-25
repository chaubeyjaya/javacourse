/**
 random datat rhega usme se zero ko aage rkhana hai aur one ko end mai like
 [1,0,0,1,1,0]=[0,0,0,1,1,1]
 */
public class ArrangZeroandOne {

    public static void segregate0and1(int arr[]) {
        int numberOfZero = 0;

        // Count zeros
        for (int ele : arr) {
            if (ele == 0) numberOfZero++;
        }

        // Fill zeros
        for (int i = 0; i < numberOfZero; i++) {
            arr[i] = 0;
        }

        // Fill ones
        for (int i = numberOfZero; i < arr.length; i++) {
            arr[i] = 1;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 0, 0, 1, 1, 0};

        segregate0and1(arr);

        // Print result
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}