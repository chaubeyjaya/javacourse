//two variable and pointer

/**
 * two variable declare i and j
 * i agee se start hoga ur j last se
 * loop tabb tak chlega jab tak j aur i na takraye
 * while(i<j){
 * swap(arr[i],arr[j])
 * i++
 * j--
 * }
 */
public class ReverseArray {

    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 8, 9};
        int n = arr.length;

        int i = 0, j = n - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

    }
}
