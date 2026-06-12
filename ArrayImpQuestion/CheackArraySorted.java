/**
 * public class ArrayPract{
   

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        boolean found=true;
        int max =arr[0];
        for(int i =0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    System.out.println("array are not sorted");
                    found=false;
                    break;
                }
            }
        }
if(found){
    System.out.println("yes array are sorted");
}
    }
}
 */