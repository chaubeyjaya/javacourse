public class profitloss{
    public static void main(String[] args) {
        int cp=20;
        int sp=40;
        if(sp>cp){
            System.out.println("yes you are in profit "+" "+ (sp-cp));
        }else{
            System.out.println("no tou are in loss"+ " "+(cp-sp));
        }

    }
}