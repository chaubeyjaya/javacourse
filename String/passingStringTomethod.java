public class passingStringTomethod {

    public static String change(String x) {//passby value
        x = "jaya";
        return x;
    }

    public static void main(String[] args) {
        String x = "riya";
        System.out.println(x);

      //  x = change(x);  // now  o/p is riya and jaya
change(x);//in this case output will be riya and riya

        System.out.println(x);
    }
}