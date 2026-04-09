public class CountSum{
    public static void main(String[] args) {
        int n = 123;
        int count = 0;
        int sum = 0;
        while(n!=0){
            int tem = n%10; //this will give the last number we store that last number in this variable
            
            sum+=tem;
            n=n/10;   //this will remov ethe last number
            count++;

        }
        System.out.println(sum);
         System.out.println(count);

    }
}