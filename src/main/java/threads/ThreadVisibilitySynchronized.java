package threads;

import java.util.concurrent.locks.Lock;

/**
 * 该用例演示了synchronized保证线程安全的可见性问题
 * flag 更新后，其他线程的flag也更新
 * runnable Test
 */
public class ThreadVisibilitySynchronized {

    private static boolean flag = true;
    private static Object lock = new Object();
    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            while (flag) {
                synchronized (lock){

                }
            }
        }).start();

        Thread.sleep(2000);

        new Thread(() -> {
            synchronized (lock){
                flag = false;
                System.out.println("flag:" + flag);
            }
        }).start();
    }
}