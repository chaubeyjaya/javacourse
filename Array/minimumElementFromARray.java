public class minimumElementFromARray{
    public static void main(String[] args) {
        int [] arr = {2,3,9,23,1};
        // int min = Integer.MAX_VALUE;  
        int min=arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
