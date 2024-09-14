//USING EXTENDS THREAD method-- METHOD 1

package Multithreading;

class MyThread extends Thread
{
    public void run()
    {
        System.out.println("in child MyThread");
    }
}

public class CreateThreads {
    public static void main(String[] args) {

        MyThread t= new MyThread();
        t.start();
    }
}
