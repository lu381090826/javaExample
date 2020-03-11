package threads;

import java.util.concurrent.TimeUnit;

/**
 * 并发 join
 *
 * */
public class JoinExample
{
    public static void main(String[] args) throws InterruptedException
    {
        Thread t = new Thread(() -> {
            System.out.println("First task started");
            System.out.println("Sleeping for 2 seconds");
            try
            {
                Thread.sleep(1);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println("First task completed");
        });
        Thread t1 = new Thread(() -> System.out.println("Second task completed"));
        t.start(); // Line 15
//        t.join(); // Line 16
        t1.start();
        Thread.sleep(1000);
        TimeUnit.SECONDS.sleep(1);
    }
}