
/**
 when we pass array by method so array pass by refrence 
 */

public class PassingArrayTomethod{
    public static  void chnage(int y[]){ //passsing by refrence
        y[2]=23;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(arr[2]);
        chnage(arr);
        System.out.println(arr[2]);
    }
}