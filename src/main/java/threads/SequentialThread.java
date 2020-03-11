package threads;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 顺序执行线程
 */
public class SequentialThread {


    public static void main(String[] args) throws InterruptedException {
        SeqDataWithCondition data = new SeqDataWithCondition();
        new Thread(() -> {
            for (int i = 0; i < 40; i++) {
                try {
                    data.printA();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }, "A").start();

        new Thread(() -> {
            for (int i = 0; i < 40; i++) {
                try {
                    data.printB();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "B").start();

        new Thread(() -> {
            for (int i = 0; i < 40; i++) {
                try {
                    data.printC();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "C").start();

    }


}


/**
 * 用synchornized搭配wait通信
 */
class SeqDataWithSynchorized {

}

/**
 * 用lock搭配Condition通信，不是当前顺序则await,是当前状态则通知下一个线程执行
 */
class SeqDataWithCondition {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition1 = lock.newCondition();
    private Condition condition2 = lock.newCondition();
    private Condition condition3 = lock.newCondition();
    private int now = 1;

    public void printA() throws InterruptedException {
        lock.lock();
        while (now != 1) {
            condition1.await();
        }
        System.out.println("AAAAAA");
        now = 2;
        condition2.signal();

        lock.unlock();
    }

    public void printB() throws InterruptedException {
        lock.lock();
        while (now != 2) {
            condition2.await();
        }
        System.out.println("BBBBBB");
        condition3.signal();
        now = 3;
        lock.unlock();

    }

    public void printC() throws InterruptedException {
        lock.lock();
        while (now != 3) {
            condition3.await();
        }
        System.out.println("CCCCCC");
        now = 1;
        condition1.signal();
        lock.unlock();
    }
}