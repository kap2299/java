//using EXTENDS THREADS method --MENTHOD 1

package Multithreading;
import java.util.Scanner;
//for achieving multithreading we havee to create two seperate classes for both processes which extends
//to thread class
class calc extends Thread
{
    public void run()
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter first number");    //first individual process
        int a1=sc.nextInt();
        System.out.println("Enter Second number");
        int a2= sc.nextInt();
        int r1=a1+a2;
        System.out.println("sum of a1 and a2 is : "+r1);

        System.out.println("-------------------------------------");
    }
}
class message extends Thread
{
    public void run()
    {
        Scanner scan= new Scanner(System.in);            //second individual process
        System.out.println("enter any string to print it three times");
        String str= scan.nextLine();
        for (int i=0; i<3; i++)
        {
            System.out.println(str);
        }
    }
}



public class CreateMultiThread {
    public static void main(String[] args) {

        calc t1= new calc();
        message t2= new message();

        t1.start();//by calling strt we are handing process to ThreadScheduler becaus it is only responsible for scheduling threads
        t2.start();
    }
}
