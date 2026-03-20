
/*
take possitve integer input and print
riya ifnumber is divisible by 5
jiya if number divisible by 3
jaya if number is divisible by 5 Aand 3 both 
jagu if number is not divisible by 3,5
*/ 

// public class ElseifLadder{
//     public static void main(String[] args) {
//         int n = 29;
//         if(n%3==0 && n%5==0){
//             System.out.println("Jagu");
//         }else if(n%3==0){
//             System.out.println("Jaya");
//         }else if(n%5==0 ){
//             System.out.println("Riya");
//         }else{
//             System.out.println("jiya");
//         }
//     }
// }



/**
 Greater of three number
 */

public class ElseifLadder{
    public static void main(String[] args) {
        int a = 223 ;
        int b = 30;
        int c = 4;
        
        if(a>b && a>c){
            System.out.println("a is greater " +a);
        }else if(b>a && b>c){
            System.out.println("b is greater " +b);
        }else{
            System.out.println("C is greter than a and b " +c);
        }

    }
}
