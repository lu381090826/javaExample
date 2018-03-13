package basic;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Gavinlu on 2018/3/10.
 * 查看treehmap源码
 */
public class TreeMapExample {
    public static void main(String arg[]) {
        Map<String, String> s = new TreeMap<String, String>();
        s.put("11", "1");
        s.put("11", "3");
        System.out.print(s.get("11"));
        System.out.print(s.get("11").hashCode());
    }
}
