/*
 select the smallest elemet and swap it with first element
 total number of operatiob:
 n,n-1,n-2,n-3.......1= n(n+1)/2

 */

public class SelectionSort {

    public static void print(int arr[]) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int arr[] = {2, 15, 3, 12, 5};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            //for finding small
            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    mindx = j;
                }
            }

            //swap
            int temp=arr[i];
            arr[i]=arr[mindx];
            arr[mindx]=temp;
        }
print(arr);
    }
}
