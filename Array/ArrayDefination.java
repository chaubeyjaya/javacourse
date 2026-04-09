/**
 array is linear datastructure 

 */


// public class ArrayDefination{
//     public static void main(String[] args) {
//         //1st way to make array
//         int a []={2,3,4,5,6,7};
//         //indexing
//         System.out.println(a[0]);
//            System.out.println(a[1]);
//        System.out.println(a[2]);
//           System.out.println(a[3]);
//updating
//a[2]=89


//     }
// }





//second way of intializing th array

public class ArrayDefination{
    public static void main(String[] args) {
      
int [] arr = new int[5];
arr[0]=12;
arr[1]=13;
arr[2]=14;
arr[3]=15;
arr[4]=16;

for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
}
    }
}