package basic;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring4 {


    public static void main(String[] args) {
        String s = "ASDAGFLAKSJDWE";
        String t = "DSAK";
        MinimumWindowSubstring4Data data = new MinimumWindowSubstring4Data();
        System.out.print(data.out(s, t));
    }
}

class MinimumWindowSubstring4Data {
    public String out(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);

        }

        int left = 0;
        int count = 0;
        int head = 0;
        int end = 0;
        int length = Integer.MAX_VALUE;
        for (int right = 0; right < s.length(); right++) {
            if (map.containsKey(s.charAt(right))) {
                if (map.get(s.charAt(right)) > 0) {
                    count++;
                }
                map.put(s.charAt(right), map.get(s.charAt(right)) - 1);
            }
            while (count == map.size()) {
                if (right - left < length) {
                    length = right - left;
                    head = left;
                    end = right;
                }

                if (map.containsKey(s.charAt(left))) {
                    if (map.get(s.charAt(left)) >= 0) {
                        count--;
                    }
                    map.put(s.charAt(left), s.charAt(left) + 1);
                }
                left++;
            }
        }
        if (length == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(head, end+1);
    }
}