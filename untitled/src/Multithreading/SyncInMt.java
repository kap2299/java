package Multithreading;

            //ACHIEVING SYNCHRONIZATION BY USING synchronized IN THE METHOD run

class cars implements Runnable
{
    synchronized public void run()//by applying sync, only one thread at a time will get into method
    {
        try
        {
            System.out.println(Thread.currentThread().getName()+" entered the parking lot");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" Got into car");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" Car started to run on road");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" Came back and Parked car");
        }
        catch (Exception e)
        {
            System.out.println("Something went wrong");
        }
    }
}

public class SyncInMt {
    public static void main(String[] args) {

        cars c= new cars();
        Thread thread1= new Thread(c);
        Thread thread2= new Thread(c);
        Thread thread3= new Thread(c);

        thread1.setName("SON-1");
        thread2.setName("SON-2");
        thread3.setName("SON-3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
