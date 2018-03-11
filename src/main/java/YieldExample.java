/**
 *
 * @author Gavinlu
 * @date 2018/3/6
 */
public class YieldExample {
    public static void main(String[] args) {
        Thread producer = new Producer();
        Thread consumer = new Consumer();

        //Min Priority
        producer.setPriority(Thread.MIN_PRIORITY);
        //Max Priority
        consumer.setPriority(Thread.MAX_PRIORITY);

        producer.start();
        consumer.start();
    }
}

class Producer extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("I am Producer : Produced Item " + i);
            Thread.yield();
        }
    }
}

class Consumer extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("I am Consumer : Consumed Item " + i);
            Thread.yield();
        }
    }
}
