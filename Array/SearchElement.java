//linear search
public class SearchElement{
    public static void main(String[] args) {
        int[]arr={2,3,4,5,6};
        int x = 3;
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                System.out.println(arr[i]);
                found =true;
                break;

            }
                
        }
      if(!found){
        System.out.println("Element not found");
      }
    }
}