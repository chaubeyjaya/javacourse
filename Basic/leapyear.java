public class leapyear{
    public static void main(String[] args) {
        int year = 2028;
        if((year%4==0 && year%100!=0 )||( year%400==0 )){
            System.out.println("yes it is leap yaer");
        }else{
            System.out.println("no.....");
        }
    }
}