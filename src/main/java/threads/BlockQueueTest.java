package threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockQueueTest {
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue blockingQueue = new ArrayBlockingQueue(3);
        blockingQueue.add("a");
        blockingQueue.add("b");
        blockingQueue.add("b");
        blockingQueue.put("b");
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());

        blockingQueue.remove("a");
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(3);
        linkedBlockingQueue.add("a");
        linkedBlockingQueue.add("b");
        linkedBlockingQueue.add("c");

        System.out.println(linkedBlockingQueue.poll());
        System.out.println(linkedBlockingQueue.poll());
        System.out.println(linkedBlockingQueue.poll());
        System.out.println(linkedBlockingQueue.poll());
    }
}
