public class CharEx{
    public static void main(String arg[]){
 char  n = 'A';
 System.out.println(n);

//Ascii value
/**
 a=97               A=65                  0=48
 b=98               B=66                  1=49
 c=99               C=67                  2=50

 z=122              Z=90                  9=57

 */

//implict type casting 
char ch = 'A';
int x = ch;
System.out.println(x);

char jaya  = '3';
System.out.println((int)jaya);

//charctet to integer
char cha = 'b';
System.out.println(cha+0); //if we add charactet with integer then it convert it in integer

//integer to character
int a = 43;
char c = (char) a;
System.out.println(c);

    }

}