package basic;

import java.util.*;

/**
 * Created by Gavinlu on 2018/3/10.
 */
public class ListExample {
    public static void main(String arg[]) {
        List<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(3);
        System.out.print(linkedList.get(0));

        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(3);
        System.out.print(arrayList.get(0));
    }
}
