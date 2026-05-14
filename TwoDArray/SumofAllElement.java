
import java.util.Scanner;

public class SumofAllElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int[][] arr = {{2,3,4,5},{1,2,5,6},{6,7,8,5}};
      int sum = 0;
        for (int i = 0; i < arr.length; i++) 
       {
          
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];
            }
           
        }
        System.out.println(sum);

    }
}
