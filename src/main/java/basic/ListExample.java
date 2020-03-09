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
        arrayList.remove(0);
        System.out.printf(":::::::"+String.valueOf(arrayList.size()));
        List<Integer> vector = new Vector<>();
        vector.add(3);
//        System.out.print(arrayList.get(0));
    }
}
