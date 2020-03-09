package basic;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Gavinlu on 2018/3/10.
 * 查看hashmap源码
 */
public class MapExample {
    public static void main(String arg[]) {
        Map<String, String> hashMap = new HashMap<String, String>();
        hashMap.put(null,null);
        Map<String, String> treeMap = new TreeMap<String, String>();
        treeMap.put("11", "1");
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("11");

        Map<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        linkedHashMap.put("11", "1");
        Map<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("11", "1");

        Set<String> set = new HashSet<>();
        set.add("11");
        set.add("22");

        System.out.print(hashMap.get("11"));
        System.out.print(hashMap.get("11").hashCode());
        System.out.print(treeMap.get("11"));
        System.out.print(concurrentHashMap.get("11"));
    }
}
