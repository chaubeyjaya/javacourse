class Complex{
    int x;
    int y;
    Complex(int x,int y){
        this.x=x;
        this.y=y;
    }
void add(Complex c2){
    this.x+=c2.x;
    this.y+=c2.y;
}
    void print(){
        System.out.println(x+" +  i"+y);
    }
}
public class ComplexNumberClass{
    public static void main(String[] args) {
        Complex c1 = new Complex(5, 2);
         Complex c2 = new Complex(3, 4);
           c1.print(); 
         c1.add(c2);
        c1.print(); 
        c2.print();
    }
}