package Multithreading;

class carss implements Runnable
{
    public void run()
    {
        try {
            System.out.println(Thread.currentThread().getName() + " get into parking lot");
            Thread.sleep(3000);

        synchronized (this)  //synchronizing by the blocked which have to be executed in sequence by thread
                    {
            System.out.println(Thread.currentThread().getName() + " got into the car");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + " Started driving the car");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + " returen to the parking lot");
            Thread.sleep(3000);
                    }
        }
        catch (Exception e)
        {
            System.out.println("Something went wrong !! sorry");
        }
    }
}

public class SyncInMt2 {
    public static void main(String[] args) {

        carss crs= new carss();

        Thread thr1= new Thread(crs);
        Thread thr2= new Thread(crs);
        Thread thr3= new Thread(crs);

        thr1.setName("SON-1");
        thr2.setName("SON-2");
        thr2.setName("SON-3");

        thr1.start();
        thr2.start();
        thr3.start();

    }
}
