public class Findprime{
    public static void main(String[] args) {
        int n=12;
        boolean isprime=true;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                isprime=false;
                break;
            }
        }
        System.out.println(isprime);
        if(isprime){
            System.out.println("yes the given number is prime");
        }else{
            System.out.println("noo.....");
        }
    }
}