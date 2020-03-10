package threads;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 该用例演示了线程安全的可见性问题
 * flag 更新后，其他线程的flag并没更新,用Reentrantlock解决
 * runnable Test
 */
public class ThreadVisibilityUseLock {

    private static boolean flag = true;
    private static ReentrantLock lock = new ReentrantLock();
    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            while (flag) {
                lock.lock();
                lock.unlock();
            }
        }).start();

        Thread.sleep(2000);

        new Thread(() -> {
            flag = false;
            System.out.println("flag:" + flag);
        }).start();
    }
}