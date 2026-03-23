public class SecondMaxEle{
    public static void main(String[] args) {
        int arr[]={3,6,7,9,4};
        int max = Integer.MIN_VALUE;
        int secmax =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
               max=arr[i];
            }
        }
        System.out.println(max);
        for(int i=0;i<arr.length;i++){
            if(arr[i]>secmax && arr[i]!=max){
                secmax=arr[i];
            }
        }
        System.out.println(secmax);
    }
}