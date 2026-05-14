public class printArraycolumwise{
    public static void main(String[] args) {
         int[][] arr = {{2, 3, 4, 5}, {1, 2, 5, 6}, {6, 7, 8, 5}};
         for(int j=0;j<arr[0].length;j++){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        
         }
    }
}