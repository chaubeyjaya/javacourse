/**
 * arr1=[ 3,4,2,2,4] arr2=[3,2,2,7]
 * now in otput dono array mai jo common hai wo aayega 
 * 2,2,3
  */



// public class CommonElement {

//     public static void Common(int a[], int b[]) {
//         for (int i = 0; i < a.length; i++) {
//             for (int j = 0; j < b.length; j++) {
//                 if (a[i] == b[j]) {
//                     System.out.print(a[i] + " ");
//                     b[j] = -1; // mark as used so duplicate handled correctly
//                     break;
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int arr1[] = {3, 4, 2, 2, 4};
//         int arr2[] = {3, 2, 2, 7};

//         Common(arr1, arr2);
//     }
// }



import java.util.Arrays;

public class CommonElement {

    public static void Common(int a[], int b[]) {
        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0, j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                System.out.print(a[i] + " ");
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int arr1[] = {3, 4, 2, 2, 4};
        int arr2[] = {3, 2, 2, 7};

        Common(arr1, arr2);
    }
}