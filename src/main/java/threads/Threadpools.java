package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threadpools {
    public static void main(String[] args) {

        //固定线程数的线程池，固定核心线程数，且等于非核心线程数
        ExecutorService service = Executors.newFixedThreadPool(10);
        service.execute(new Thread());
        //动态可伸缩的线程池，核心线程数0
        ExecutorService service2 = Executors.newCachedThreadPool();

    }
}
