/**
 *(automatic jab bhi aap chote datatype ko bde mai convert krenge to  to wo easily hojayega ) implicit type casting ::::byte--short--int--long--float--double
 * (forcefully we conver th large datatype in small dattype )explixit type casting::::::opotiote of thid arraw start from last 
 */

public class typecasting{
    public static void main(String[] args) {
        float myfloat=5;       //float hai bda aur usme hm interger jo small datattype hota hai isko implicit 
        double d = 4;      //we store samll value in large container intger is small
        System.out.println(myfloat); //forcefully we convert

        int n =(int) 5.6; //we conert the float in integer forecfully
        
    }
}