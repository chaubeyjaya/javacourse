
import java.util.Arrays;

public class ShallowandDeepCopy{
    public static void main(String[] args) {
        //shallow copy
        // int [] arr = {2,3,4,5,6};
        // int [] x = arr; //x is shallow  copy of arr actual mai copy nhi banani ab uska name change kiya
        // x[0]=100;
        // System.out.println(arr[0]);


//deep copy
         int [] arr = {2,3,4,5,6};
        int [] deep = Arrays.copyOf(arr, arr.length); //here we create a new copy like photocopy of orginal
        deep[0]=100;
        System.out.println(arr[0]); //no changes in x array
    }
}