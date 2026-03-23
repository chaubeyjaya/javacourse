
import java.util.Scanner;

// public class PrintNegativeElemnt{
//  public static void main(String[] args) {
     
//      int [] arr = {2,-3,4,5,-6};
//      for(int i =0;i<arr.length;i++){
//         if(arr[i]<0){
//             System.out.print(arr[i] +" ");
//         }
//      }
//  }
// }







//taking input from user
public class PrintNegativeElemnt{
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array ");
     int n = sc.nextInt();
     int [] arr = new int[n];
     //input
     System.out.println(" enetr the element");
     for(int i = 0;i<n;i++){
        arr[i]= sc.nextInt();
     }
     for(int i =0;i<arr.length;i++){
        if(arr[i]<0){
            System.out.print(arr[i] +" ");
        }
     }
 }
}