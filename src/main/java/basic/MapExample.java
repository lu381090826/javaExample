package basic;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Gavinlu on 2018/3/10.
 * 查看hashmap源码
 */
public class MapExample {
    public static void main(String arg[]) {
        Map<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("11", "3");

        Map<String, String> treeMap = new TreeMap<String, String>();
        treeMap.put("11", "1");

        System.out.print(hashMap.get("11"));
        System.out.print(hashMap.get("11").hashCode());
        System.out.print(treeMap.get("11"));
    }
}
