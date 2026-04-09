public class BinarySearch{
 public static void main(String[] args) {
     int arr[] ={4,3,2,7,9,13,16,19};
     int n = arr.length;
     int  target = 13;
     int lo=0;
     int hi=n-1;
   boolean found = false;
     while(lo<=hi){
        int mid = (lo+hi)/2;
        if(arr[mid]==target){
            System.out.println("yes element are found "+mid);
            found = true;
            break;
        }else if(arr[mid]>target){
            hi = mid-1;

        }else{
            lo=mid+1;
        }
        
     }
   

  if(!found){
        System.out.println("element not found");
     }
 }
}