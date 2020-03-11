package threads;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Condition类用法
 * await类似synchronized中的wait
 * single类似synchronized中的notify
 */
public class LocksCondition {


    public static void main(String[] args) throws InterruptedException {
        DataWithCondition data = new DataWithCondition();
        new Thread(() -> {
            for (int i = 0; i < 40; i++) {
                try {
                    data.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }, "A").start();

        new Thread(() -> {
            for (int i = 0; i < 40; i++) {
                try {
                    data.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "B").start();

    }


}


/**
 * 用synchornized搭配wait通信
 */
class DataWithSynchorized {
    private int number;
    private Object lock = new Object();

    public void increment() throws InterruptedException {
        synchronized (lock) {
            while (number != 0) {
                //等待
                lock.wait();
            }
            number++;
            System.out.println(Thread.currentThread().getName() + "=>" + number);
            lock.notifyAll();
        }

    }

    public void decrement() throws InterruptedException {
        synchronized (lock) {
            while (number == 0) {
                //等待
                lock.wait();
            }
            number--;
            System.out.println(Thread.currentThread().getName() + "=>" + number);
            lock.notifyAll();
        }

    }
}

/**
 * 用lock搭配Condition通信
 */
class DataWithCondition {
    private int number;
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void increment() throws InterruptedException {
        lock.lock();
        while (number != 0) {
            //等待
            condition.await();
        }
        number++;
        System.out.println(Thread.currentThread().getName() + "=>" + number);
        condition.signalAll();
        lock.unlock();
    }

    public void decrement() throws InterruptedException {
        lock.lock();
        while (number == 0) {
            //等待
            condition.await();
        }
        number--;
        System.out.println(Thread.currentThread().getName() + "=>" + number);
        condition.signalAll();
        lock.unlock();

    }
}