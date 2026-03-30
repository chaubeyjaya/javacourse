// public class BinarySearch {
//     public static void main(String arg[]) {

//         int arr[] = {2,3,6,7,8,9,12,14,16};
//         int n = arr.length;

//         int lo = 0;
//         int hi = n - 1;

//         int target = 12;

//         while (lo <= hi) {
//             int mid = (lo + hi) / 2;

//             if (arr[mid] > target) {
//                 hi = mid - 1;
//             } 
//             else if (arr[mid] < target) {
//                 lo = mid + 1;   
//             } 
//             else {
//                 System.out.println("Element found "+target);
//                 break;  
//             }
//         }

    
//         if (lo > hi) {
//             System.out.println("Element not found");
//         }
//     }
// }


public class BinarySearch {

    public int search(int arr[], int target) {
        int n = arr.length;
        int lo = 0;
        int hi = n - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                lo = mid + 1;
            else
                hi = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {2, 3, 6, 7, 8, 9, 12, 14, 16};
        int target = 12;

        BinarySearch obj = new BinarySearch();  // create object
        int result = obj.search(arr, target);

        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
    }
}