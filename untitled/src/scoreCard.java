import java.util.Scanner;

class studMarks
{
    String sname;
    float eng;
    float maths;
    float cs;
    float percent;

    void input()
    {
        Scanner scan= new Scanner(System.in);

        System.out.println("student name : ");
        sname= scan.nextLine();
        System.out.println("Marks of english : ");
        eng= scan.nextFloat();
        System.out.println("marks of maths : ");
        maths= scan.nextFloat();
        System.out.println("marks of computer science : ");
        cs=scan.nextFloat();
    }
     void compute()
     {
        percent=(eng+maths+cs)/300*100;
     }

     void display()
     {
         System.out.println(sname);
         System.out.println("english : "+eng);
         System.out.println("maths : "+ maths);
         System.out.println("computer : "+ cs);
         System.out.println("your percentage is  : "+ percent);
     }
}
public class scoreCard
{
    public static void main(String[] args) {
        studMarks stud1= new studMarks();
        studMarks stud2= new studMarks();

        stud1.input();
        stud1.compute();
        stud1.display();

        stud2.input();
        stud2.compute();
        stud2.display();

    }
}
