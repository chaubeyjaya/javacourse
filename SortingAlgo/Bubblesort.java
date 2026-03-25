
/**
 * it help to sorting the array
 * see two adjecent element and swap it  if first elemeyt bda hai next wale se to for e.g
 * in bubble sort n-1 pass hota hai      very very imp
 *time complexity=O(n^2)
 whole operation is (n-1)^2




 *  [3,5,1,4,2,0]
 * step 1 [ 3,1,5,4,2,0]->[3,1,4,2,0,5]
 * [3,1,4,2,0,5]
 * step 2 [1,3,2,0,4,5]
 * step3 [ 1,2,0,3,4,5]
 * step4 [1,0,2,3,4,5]
 * step 5 [0,1,2,3,4,5]
 *
 */

public class Bubblesort {

    public static void print(int arr[]) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {

        int arr[] = {4, 1, 2, 0, 5, 7, 3};
        int n = arr.length;
        print(arr);
        for (int i = 0; i < n - 1; i++) {  //n-1 passes

            for (int j = 0; j < n - 1; j++) {    // for (int j = 0; j < n - 1-i; j++) we can write this also to make its time complexity will be same but speed will incerae  more proper
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }

        print(arr);
    }
}





// //we check the loop is sorted or not if already sorted so need to waste time so increse the seep

// public class Bubblesort {

//     public static void print(int arr[]) {
//         for (int ele : arr) {
//             System.out.print(ele + " ");
//         }
//         System.out.println(" ");
//     }

//     public static void main(String[] args) {

//         int arr[] = {4, 1, 2, 0, 5, 7, 3};
//         int n = arr.length;
//         print(arr);
//         for (int i = 0; i < n - 1; i++) {  //n-1 passes
// int swap=0;
//             for (int j = 0; j < n - 1; j++) {    // for (int j = 0; j < n - 1-i; j++) we can write this also to make its time complexity will be same but speed will incerae  more proper
//                 if (arr[j] > arr[j + 1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                     swap++;
//                 }
//             }
// if(swap==0)break;
//         }

//         print(arr);
//     }
// }
