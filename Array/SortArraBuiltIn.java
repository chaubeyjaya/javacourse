
import java.util.Arrays;

public class SortArraBuiltIn{
    public static void main(String[] args) {
        int arr []={2,7,4,89,34};
        print(arr);

        Arrays.sort(arr);
        print(arr);
    }


    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
}