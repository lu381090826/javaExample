package basic;

import java.security.Policy;
import java.util.concurrent.*;

public class test {
    public static void main(String[] args) {
//        Runnable runnable = () -> {
//            try {
//                Thread.sleep(10000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        };
//        runnable.run();

        ArrayBlockingQueue<Runnable> objects = new ArrayBlockingQueue<>(1000);


        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10,
                30, TimeUnit.SECONDS, objects);
        for (int i = 0; i < 1000; i++) {
            int finalI = i;
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    System.out.println(finalI);
                }
            };
            objects.add(runnable);
        }

        threadPoolExecutor.execute(() -> {
        });

    }
}