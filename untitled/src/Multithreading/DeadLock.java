package Multithreading;

class library implements Runnable
{
    String res1=("Java");
    String res2= ("SQL");
    String res3= ("DSA");


    public void run()
    {
        String name= Thread.currentThread().getName();

        if (name.equals("STUDENT1"))
        {
            try
            {
                Thread.sleep(2000);
                synchronized (res1)
                {
                    System.out.println("Student 1 has acquired "+ res1);
                    Thread.sleep(2000);
                    synchronized(res2)
                    {
                        System.out.println("Student 1 has acquired "+ res2);
                        Thread.sleep(2000);
                        synchronized(res3)
                        {
                            System.out.println("Student 1 has acquired "+ res3);
                            Thread.sleep(2000);
                        }
                    }
                }
            }
            catch (Exception e)
            {
                System.out.println("something went wrong");
            }
        }
        else
        {
            try
            {
                Thread.sleep(2000);
                synchronized (res1)
                {
                    System.out.println("Student 1 has acquired "+ res1);
                    Thread.sleep(2000);
                    synchronized (res2)
                    {
                        System.out.println("Student 1 has acquired "+ res2);
                        Thread.sleep(2000);
                        synchronized(res3)
                        {
                            System.out.println("Student 1 has acquired "+ res3);
                        }
                    }
                }
            }
            catch (Exception e)
            {
                System.out.println("something went wrong");
            }
        }
    }
}

public class DeadLock {
    public static void main(String[] args) {

        library lib= new library();

        Thread thrd1= new Thread(lib);
        Thread thrd2= new Thread(lib);

        thrd1.setName("STUDENT1");
        thrd2.setName("STUDENT2");

        thrd1.start();
        thrd2.start();
    }
}
