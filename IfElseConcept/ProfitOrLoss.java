public class ProfitOrLoss{
    public static void main(String[] args) {
         int cp=500;
         int sp = 700;
         if(sp>cp){
            int profit=sp-cp;
            System.out.println("It is profit of " +profit);
            int pp=(profit*100)/cp;
            System.out.println(pp);
         }else{
            //same as for loss precentage
            System.out.println("it is in loss  "+(cp-sp));
         }
    }
}