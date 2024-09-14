package Multithreading;
import java.util.Scanner;
class MyThread2 extends Thread
{
    public void run()
    {
        String tname= Thread.currentThread().getName();
        if (tname.equals("calc")){
            calc2();
        }
        else{
            importantMsg();
        }
    }
    public void calc2()
    {
        Scanner scr= new Scanner(System.in);
        System.out.println("enter 1st no.");
        int z1= scr.nextInt();
        System.out.println("enter 2nd no.");
        int z2= scr.nextInt();
        System.out.println("result is  :  "+ (z1+z2));
        System.out.println("------------------------------------------------");
        scr.close();
    }

    public void importantMsg()
    {
        Scanner scc= new Scanner(System.in);
        System.out.println("enter any string to print 3X");
        String msg=scc.nextLine();
        for (int i=0; i<3; i++)
        {
            System.out.println(msg);
        }
    }
}

public class MTbyOneRunMethod {
    public static void main(String[] args) {

        MyThread2 th1= new MyThread2();
        MyThread2 th2= new MyThread2();

        th1.setName("calc");
        th2.setName("msg");

        th1.start();
        th2.start();


    }
}
