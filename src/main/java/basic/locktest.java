package basic;

import java.util.concurrent.locks.ReentrantLock;

public class locktest {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock(true);
        lock.lock();
        Thread thread = new Thread(() -> {
            System.out.println("2221");
        });
        Thread thread2 = new Thread(() -> {
            System.out.println("2222");
        });
        Thread thread3 = new Thread(() -> {
            System.out.println("2223");
        });
        thread.start();
        thread2.start();
        thread3.start();
        System.out.println("1111");


    }
}
