package basic;

import java.util.*;

/**
 * Created by Gavinlu on 2018/3/10.
 */
public class ListExample {
    public static void main(String arg[]) {
        int oldCapacity = 1;
        System.out.print(oldCapacity >> 1);
        System.out.print(oldCapacity >> 1);

        List<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(3);
        linkedList.add(9);
        System.out.print(linkedList.get(1));

        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(3);
        arrayList.remove(3);
        System.out.print(arrayList.get(0));
    }


}
