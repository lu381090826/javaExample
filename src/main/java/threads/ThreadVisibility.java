package threads;

/**
 * 该用例演示了线程安全的可见性问题
 * flag 更新后，其他线程的flag并没更新
 * runnable Test
 */
public class ThreadVisibility {

    private static boolean flag = true;

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            while (flag) {

            }
        }).start();

        Thread.sleep(2000);

        new Thread(() -> {
            flag = false;
            System.out.println("flag:" + flag);
        }).start();
    }
}