package threads;

/**
 * 该用例演示了线程安全的原子性问题
 * 当共享变量操作到一半的时候，另外一个线程也可能对共享变量进行操作，对前一个操作没有保证原子性
 * runnable Test
 */
public class ThreadAtomicity {

    private static int flag = 0;

    public static void main(String[] args) throws InterruptedException {

        new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                flag++;
            }
            System.out.println(flag);
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                flag++;
            }
            System.out.println(flag);
        }).start();

        System.out.println(flag);
    }
}