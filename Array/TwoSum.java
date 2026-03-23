/**
 *el=k array diya hoga uske two element ko add krenge to target ke equal hona chahiye whi found krna hai 
 */



public class TwoSum{
    public static void main(String[] args) {
        int []arr ={3,4,5,6};
        int n =arr.length;
       int target=8;
       boolean found =false;
       for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]+arr[j]==target){
              System.out.println("found  " +arr[i]+" "+arr[j]);
                found=true;
                break;
            }

        }
       
       }
if(!found){
    System.out.println("not");
}
    }
}