package threads;

import java.util.concurrent.CountDownLatch;

/**
 * 线程辅助减法计数器
 */
public class CountdownLatchTest {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(6);
        countDownLatch.countDown();
        for (int i = 0; i < 6; i++) {
            new Thread(()->{
                countDownLatch.countDown();
            }).start();
        }
        //等待归零才会往下执行
        countDownLatch.await();

        System.out.print("Process Finish");
    }

}
