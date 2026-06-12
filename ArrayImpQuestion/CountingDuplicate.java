/**
 * public class ArrayPract{
    static void print(int arr[]){
          for(int ele:arr){
            System.out.print(ele+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,2,6,2};
        int count=0;
        boolean found =false;
        int dupilcate=arr[0];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                  
                }
            }
        }
          System.out.println(count);
    
      
    }
}
 */