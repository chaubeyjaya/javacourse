// class student{
//     String name;
//     int rollo;
//     double cgpa;


// }

public class passingObjectToMethod{
    public static class Car{
        int seat;
        String name;
        double length;
        String  type;
        void print(){
            System.out.println(seat+" "+name+" "+length+" "+type);
        }
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.name="BMW";
        c.length=3.2;
        c.seat=4;
        c.type="fuel";
        c.print();
        change(c);
        System.out.println(c.seat);
    }
    private static  void change(Car x){//pass by refrence when object pass in method
        x.seat=12;
    }
}