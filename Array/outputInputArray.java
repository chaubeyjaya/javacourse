
import java.util.Scanner;

// public class outputInputArray{
//     public static void main(String[] args) {
//         int arr []={2,3,4,5,6};
//         for(int i =0;i<arr.length;i++){
//             System.out.print(arr[i] +" ");
//         }
//     }
// }
public class outputInputArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

//input
        for (int i = 0; i < arr.length; i++) {
           arr[i]=sc.nextInt();
        }

//output
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
