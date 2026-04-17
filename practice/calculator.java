
// public class calculator {

//     public static void main(String[] args) {
//         int a = 12;
//         int b = 13;
//         String operator="sum";
//         switch (operator) {
//             case "sum":
//                  System.out.println(a + b);
//                 break;
//              case "sub":
//                  System.out.println(a - b);
//                 break;
//                  case "mul":
//                  System.out.println(a * b);
//                 break;
//                  case "div":
//                  System.out.println(a / b);
//                 break;  
               
//         }
//     }
// }




public class calculator {

    public static void main(String[] args) {
        int a = 12;
        int b = 13;
        int ans=0;
        String operator="+";
        switch (operator) {
            case "+":
               ans = a + b;
                break;
             case "-":
                 ans =a-b;
                break;
                 case "*":
                 ans=a * b;
                break;
                 case "/":
              ans=a / b;
                break;  
              
        }
        System.out.println("result  "+ ans);
      
    }
}
