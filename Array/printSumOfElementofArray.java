
import java.util.Scanner;

// public class printSumOfElementofArray{
//     public static void main(String[] args) {
//         int [] arr = {2,3,4,5,1};
//         int n = arr.length;
//         int sum = 0;
//         for(int i =0;i<n;i++){
//             sum+=arr[i];
           
//         }
//          System.out.print(sum);
//     }
// }






//taking the input
public class printSumOfElementofArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int [] arr =new int[size];
        int n = arr.length;
        int sum = 0;

        //input
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        
        //outpiut
        for(int i =0;i<n;i++){
            sum+=arr[i];  
        }

         System.out.print(sum);
    }
}