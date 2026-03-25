/**
 arr[]=[1,2,3,5] now array ki size agar 5 hai to isme 5 element honi chahiye so isme 4 mising hai size of array n-1
 sum of 1 to n = n+(n+1)/2 e.g if n = 8  8+9/2
 */


public class MissingInarray{

  public   static  int missingNum(int arr[]){
    int n = arr.length+1;
    int sum = n*(n+1)/2;       
    int arraySum = 0;
    for(int ele:arr){
        arraySum+=ele;
    }
    return sum-arraySum;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5};
       System.out.println( missingNum(arr));
    }
}