public class practic{
  public static void main(String[] args) {
      int arr[]={2,3,4,5,12,19,23};
      int n = arr.length;
     int max =arr[0];
     int scMAx=Integer.MIN_VALUE;
     for(int i=0;i<n;i++){
        if(arr[i]>max){
            max =arr[i];
        }
     }
 
     for(int i =0;i<n;i++){
        if(arr[i]>max && arr[i]!=max){
            scMAx=arr[i];
        }
     }
     System.out.println(scMAx);

  }
}