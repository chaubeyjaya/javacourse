public class MaximumOfArray{
    public static void main(String[] args) {
        int []arr={2,3,47,5,8};
        int n = arr.length;
       int max = arr[0];
       for(int i=0;i<n;i++){
        if(arr[i]>max){
            max=arr[i];
        }
       }
       System.out.print(max);
    }
}