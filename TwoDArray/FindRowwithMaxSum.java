
// public class FindRowwithMaxSum {

//     public static void main(String[] args) {
//         int[][] arr = {{2, 3, 4, 5}, {1, 2, 5, 6}, {6, 7, 8, 5}};
//         int maxsum = Integer.MIN_VALUE;
        
//         for (int i = 0; i < arr.length; i++) {
//           int sum = 0;    //sum of individual row sum
//             for (int j = 0; j < arr[0].length; j++) {
//                 sum += arr[i][j];
//             }
//     maxsum = Math.max(maxsum,sum);
//         }
//         System.out.println(maxsum);

//     }
// }




// fow getting row number
public class FindRowwithMaxSum {

    public static void main(String[] args) {
        int[][] arr = {{2, 3, 4, 5}, {1, 2, 5, 6}, {6, 7, 8, 5}};
        int maxsum = Integer.MIN_VALUE;
        int rownum =-1;
        for (int i = 0; i < arr.length; i++) {
          int sum = 0;    //sum of individual row sum
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];
            }
  
    if(sum>maxsum){
        maxsum=sum;
        rownum=i;
    }
        }
        System.out.println(rownum+" "+maxsum);

    }
}
