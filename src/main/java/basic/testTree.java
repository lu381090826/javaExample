package basic;

import java.util.*;

public class testTree {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(11);
        queue.offer(11);
        queue.offer(11);
        queue.offer(11);
        queue.offer(11);
        ((LinkedList<Integer>) queue).get(0);
    }
}