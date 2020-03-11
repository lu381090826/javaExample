package threads;

/**
 * runnable Test
 */
public class ThreadWaitTest {

    private static Object lock = new Object();

    public static void main(String[] args) {
        new Thread(() -> {
            try {
                synchronized (lock) {
                    lock.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {

            synchronized (lock) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.printf("notify");
                lock.notifyAll();
            }
        }).start();
    }
}