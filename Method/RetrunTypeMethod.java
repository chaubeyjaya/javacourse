// public class RetrunTypeMethod{
//     public static int sum (int a,int b){
//         int ans = a+b;
//         return  ans;
//     }
//     public static void main(String[] args) {
//         int a = sum(3,4);
//         System.out.println(a);
//     }
// }


//important example to understand the return 

public class RetrunTypeMethod{
    public static int sum (int a){
        if(a>5){
            return a;
        }else{
            return 23;
        }
    }
    public static void main(String[] args) {
       
        System.out.println(sum(3));
    }
}