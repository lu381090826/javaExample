package threads;

import java.util.concurrent.locks.ReentrantLock;

/**
 * runnable Test
 */
public class ThreadLockTest {

    private static int j = 0;
//    private static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
//            lock.lock();
            for (int i = 0; i < 100; i++) {
                j++;
            }
//            lock.unlock();
        });
        Thread thread2 = new Thread(() -> {
//            lock.lock();
            for (int i = 0; i < 101; i++) {
                j++;
            }
//            lock.unlock();
        });
        Thread thread3 = new Thread(() -> {
//            lock.lock();
            for (int i = 0; i < 102; i++) {
                j++;
            }
//            lock.unlock();
        });

        thread1.start();
        thread2.start();
        thread3.start();

        Thread.sleep(100);
        System.out.printf(String.valueOf(j));
    }
}