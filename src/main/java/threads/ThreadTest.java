package threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * runnable Test
 * */
public class ThreadTest implements Runnable {
    @Override
    public void run() {
        synchronized(this) {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " synchronized loop " + i);
            }
        }
    }
    public static void main(String[] args) {
        ThreadTest t1 = new ThreadTest();
        Thread ta = new Thread(t1, "A");
        Thread tb = new Thread(t1, "B");

        try {
            ta.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ta.start();
        tb.start();
    }
}