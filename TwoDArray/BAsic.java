// public class BAsic{
//     public static void main(String[] args) {
//         int[][]arr = {{2,9,5},{8,1,6},{3,7,4}};
//       //System.out.println(arr[2][1]);
     
//     }
// }


//how e print th array
public class BAsic{
    public static void main(String[] args) {
       
        // int[][]arr =new int[3][4];   //three row forur column har row mai char column rhega
          int[][]arr={{2,3,4,5},{1,2,5,6},{6,7,8,5}};
        int row = arr.length;       //
        int col = arr[0].length;
         for(int i=0;i<row;i++){
            for(int j=0;j<col;j++ ){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
         }


     
     
    }
}