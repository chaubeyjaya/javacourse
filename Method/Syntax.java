public class Syntax{

    public static void Greeting(){
        System.out.println("Good mornig.....");
    }

       public static void Greeting(String name){
        System.out.println("Good mornig....." +name);
    }

    public static void main(String[] args) {
    
        Greeting();
        Greeting("Jaya");
     
    }
}