package Multithreading;

public class MultiThread1 {
    public static void main(String[] args) {

        System.out.println("main thread is working");
        System.out.println("---------------------------");

        System.out.println("Before changing");

        System.out.println(Thread.currentThread().getName());//default name for main thread
        System.out.println(Thread.currentThread().getPriority());//default priority for main thread

        System.out.println("-------------------------------------");
        System.out.println("After changing name and priority");

        Thread t= Thread.currentThread();
        t.setName("newMain");
        t.setPriority(3);
        System.out.println("the new name of main thread is : "+t.getName());
        System.out.println("The updated priority of the new named thread is : "+t.getPriority());
    }
}
