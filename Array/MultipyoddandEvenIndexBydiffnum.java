public class MultipyoddandEvenIndexBydiffnum{
 public static void main(String[] args) {
     int []arr ={2,3,4,5,6};
     int n = arr.length;
     for(int i=0;i<n;i++){
    if(i%2==0){
        System.out.print(arr[i]+10 +" ");
    }else{
        System.out.print(2*arr[i] +" ");
    }
     }
 }
}