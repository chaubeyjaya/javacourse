public class MethodWithparameter{

public static void add(int a,int b){
    int ans = a+b;
    System.out.println("Sum "+ans);
}

public static void Max(int a,int b,int c){
 if(a>b && a>c)System.out.println(a);
 else if(b>a && b>c)System.out.println(b);
 else System.out.println(c);
}

 public static int sum (int a,int b){
        int ans = a+b;
        return  ans;
    }


    public static void main(String[] args) {
       add(3,4) ;
       Max(3,5,2);
       System.out.println(sum(5,5));
    }
}