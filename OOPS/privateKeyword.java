//  class Students{
//         String name;//by default it null
//       private int rno=12; // by default it is 0//we can access only within the class
//         double cgpa;//0.0
//    void print(){
//     System.out.println(name+" "+rno+" "+cgpa);
//    }
//     }
// public class privateKeyword{

//     public static void main(String[] args) {
//         Students s = new Students();
//         s.cgpa=9.37;
//         s.name="jaya";
//         s.print();
//       //  s.rno=  here it show error because it doent allow to changes
//     }
// }
//getter and setter  we use getter setter for private identity
class Students {

    String name;
    private int rno; 
    double cgpa;

    void print() {
        System.out.println(name + " " + rno + " " + cgpa);
    }

    int getRno() {//getter
        return rno;
    }

    void setRno(int x) {//setter
        rno = x;
    }

}

public class privateKeyword {

    public static void main(String[] args) {
        Students s = new Students();
        s.cgpa = 9.37;
        s.name = "jaya";
        s.setRno(12);
        s.print();

        //  s.rno=  here it show error because it doent allow to changes
    }
}
