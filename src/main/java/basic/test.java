package basic;

import java.util.*;

public class test {
    public static void main(String[] args) {
        List<String> arrayList = Collections.synchronizedList(new ArrayList<>());
        for (;;) {
            new Thread(() -> {
                arrayList.add(UUID.randomUUID().toString().substring(0, 5));
                System.out.println(arrayList);
            }).start();
        }
    }
}
