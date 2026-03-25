/**
 arr=[1,2,3,4,5] d=2
 output will [3,4,5,1,2]
 explaination:when roateted by 2 it become 3,4,5,1,2


 example:
 6 , 8 ,1 ,2 ,4, 9 ,0        d=3 index        resulut =[2,4,9,0,6,8,1]

0       d-1 d        n-1         we do reverse in this pattern then new array form[1,8,6,0,9,4,2] then we reverse that array so result[2,4,9,0,6,8,1]




second way of doing 
phle pure array ko reverse kr do  0,9,4,2,1,8,6
                                  then reverse till two and  from to six reverse menas three reverse will use here
 */




public class RotateArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int d = 3;

        rotateArr(arr, d);

        // Print rotated array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void rotateArr(int arr[], int d) {
        int n = arr.length;
// Handle case when d > n
        d = d % n;
        reverse(arr, 0, d - 1); //phle hafl part reverse 
        reverse(arr, d, n - 1);  //then second half
        reverse(arr, 0, n - 1);  //once again reveser
    }

    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}