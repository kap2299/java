package Multithreading;
import java.util.Scanner;
class calc1 implements Runnable
{
    public void run()
    {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter the first number");
        int x1=scn.nextInt();
        System.out.println("Enter second number");
        int x2= scn.nextInt();
        System.out.println("Sum of both no. are :  "+ (x1+x2));
        System.out.println("-----_____------______------_____");
        scn.close();
    }
}

class message1 implements Runnable
{
    public void run()
    {
        Scanner scn1= new Scanner(System.in);
        System.out.println("Enter a string to print it three times");
        String pnt= scn1.nextLine();
        System.out.println("_______________________________________");
        for (int i=0; i<3; i++)
        {
            System.out.println(pnt);
        }
    }
}

public class mtByRunnableInterface {
    public static void main(String[] args) {

        message1 m1= new message1();
        calc1 c1= new calc1();
        Thread t1=new Thread(m1);
        Thread t2= new Thread(c1);

        t1.start();
        t2.start();
    }
}
