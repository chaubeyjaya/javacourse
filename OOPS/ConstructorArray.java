// public class ConstructorArray{
//     public static class StudentData{
//         String name;
//         int rno;
//         int marks[];

//         public StudentData(int s) {
//             marks = new int[s];
//         }
        

//     }
//     public static void main(String[] args) {
//         StudentData s1 = new StudentData(4);
//         StudentData s2 = new StudentData(6);
//         s1.marks[0]=12;
//         s1.marks[1]=13;
//         s1.marks[2]=14;
//         s1.marks[3]=15;

//     }
// }




public class ConstructorArray{
    public static class StudentData{
        String name;
        int rno;
        int marks[];

        public StudentData(int[] s) {
            marks = s;
        }
        

    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,4};
        StudentData s1 = new StudentData(arr);
   
        

    }
}