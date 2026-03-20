/**
 && means logical and both condition should be true 
 
 || bot condition not bneed to true ek shi huwa to bhi kaam hojayega

 */
/*
basic concept to check the number is four digit or not 
lets take one example 
1484
now if we divide it by 10
1484/10
148/10
14/10
1/10
0 
if number is divide by 10 or it come zero befire the four round that means it is grater ya less then four digit that number is not four digit
 */


//check th enumber is four digit number 

// public class AndOrconcept{
//     public static void main(String[] args) {
//         int n = 2323;
// if(n>999 && n<10000){
//     System.out.println("Yes it is four digit number");
// }else{
//     System.out.println("No it is not four digit number");
// }
//     }
// }



//or condition 
/**
 
 take positive integer input na stell it is divisible by 5 and 3

 */
public class AndOrconcept{
    public static void main(String[] args) {
 int n = 40;
 if(n%3==0 || n%5==0){
    System.out.println("Yes it is divisible by ");
 }else{
    System.out.println("No....");
 }
    }
}