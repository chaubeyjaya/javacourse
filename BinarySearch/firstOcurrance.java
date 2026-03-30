//this code for first occurance 


// public class firstOcurrance {

//     public int binarysearch(int[] arr, int tar) {
//         int lo = 0, hi = arr.length - 1, idx = -1;

//         while (lo <= hi) {
//             int mid = (lo + hi) / 2;

//             if (arr[mid] > tar)
//                 hi = mid - 1;
//             else if (arr[mid] < tar)
//                 lo = mid + 1;
//             else {
//                 idx = mid;
//                 hi = mid - 1;
//             }
//         }

//         return idx;
//     }

//     public static void main(String[] args) {
//         int arr[] = {2, 4, 7, 12, 15, 17, 19, 22, 25};
//         int target = 17;

//         firstOcurrance obj = new firstOcurrance();
//         System.out.println(obj.binarysearch(arr, target)+" "+target);
//     }
// }






//this is for last occurance
public class firstOcurrance {

    public int binarysearch(int[] arr, int tar) {
        int lo = 0, hi = arr.length - 1, idx = -1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (arr[mid] > tar)
                hi = mid - 1;
            else if (arr[mid] < tar)
                lo = mid + 1;
            else {
                idx = mid;
               // hi = mid - 1;
               lo=mid+1;
            }
        }

        return idx;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 7, 12, 15, 17,17, 19, 22, 25};
        int target = 17;

        firstOcurrance obj = new firstOcurrance();
        System.out.println(obj.binarysearch(arr, target)+" "+target);
    }
}